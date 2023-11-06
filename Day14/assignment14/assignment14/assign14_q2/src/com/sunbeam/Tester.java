package com.sunbeam;

import java.util.Scanner;
import java.sql.*;
import java.text.SimpleDateFormat;

public class Tester {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/javapractice";
	public static final String DB_USER = "D2_80418_Vaishnavi";
	public static final String DB_PASSWORD = "80418";
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("====================================");
		System.out.println("1. Insert new user (Voter)");
		System.out.println("2. Display all users");
		System.out.println("3. Delete voter with given id");
		System.out.println("4. Change status of voter with given id to true");
		System.out.println("5. Change the name and birth date of voter");
		System.out.println("====================================");
		System.out.print("Enter your choice : ");
		choice = sc.nextInt();
		return choice;
	}
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch(Exception ex){
			ex.printStackTrace();
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while ((choice=menu(sc))!=0) {
			switch (choice) {
			case 1:
				try (Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "INSERT INTO users(id,first_name, last_name, email, password, dob, status, role) VALUES (default,?,?,?,?,?,?,?)";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.print("Enter first name : ");
						String fname = sc.next();
						System.out.print("Enter last name : ");
						String lname = sc.next();
						System.out.print("Enter email : ");
						String email = sc.next();
						System.out.print("Enter password : ");
						String password = sc.next();
						System.out.print("Enter DOB(DD-MM-YYYY) : ");
						String dob = sc.next();
						System.out.print("Enter the status : ");
						boolean status = sc.nextBoolean();
//						String dateStr = sc.next();
						SimpleDateFormat sdf;
						sdf = new SimpleDateFormat("dd-MM-yyyy");
						java.util.Date uDate = sdf.parse(dob);
						java.sql.Date sDate;
						sDate = new java.sql.Date(uDate.getTime());
						
						stmt.setString(1, fname);
						stmt.setString(2, lname);
						stmt.setString(3, email);
						stmt.setString(4, password);
						stmt.setDate(5,sDate);
						stmt.setBoolean(6, status);
						stmt.setString(7, "voter");
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: "+count);
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 2:
				try (Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "SELECT * FROM users";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						try(ResultSet rs = stmt.executeQuery()){
							while(rs.next()) {
								int id = rs.getInt("id");
								String fname = rs.getString("first_name");
								String lname = rs.getString("last_name");
								String email = rs.getString("email");
								String pass = rs.getString("password");
								java.sql.Date sDate = rs.getDate("dob");
								SimpleDateFormat sdf;
								sdf = new SimpleDateFormat("dd-MM-yyyy");
								String dateStr = sdf.format(sDate);
								boolean status = rs.getBoolean("status");
								String role = rs.getString("role");
								System.out.printf("%d, %s, %s, %s, %s, %s, %b, %s\n", id, fname, lname, email, pass, dateStr, status, role);
							}
						}		
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 3:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "DELETE from users where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.print("Enter id : ");
						int id = sc.nextInt();
						stmt.setInt(1, id);
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: "+count);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "UPDATE users set status = true where id = ?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.print("Enter id : ");
						int id = sc.nextInt();
						stmt.setInt(1, id);
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: "+count);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					System.out.print("Enter id : ");
					int id = sc.nextInt();
					String fSql = "SELECT role from users where id=?";
					try(PreparedStatement fStmt = con.prepareStatement(fSql)){
						fStmt.setInt(1, id);
						try(ResultSet rs = fStmt.executeQuery()){
							if(rs.next()) {
								String role = rs.getString("role");
								if ("voter".equals(role)) {
									String sql = "UPDATE users SET first_name = ?, last_name = ?, dob = ? WHERE id = ?";
									try(PreparedStatement stmt = con.prepareStatement(sql)){
										System.out.print("Enter new first name: ");
			                            String newFirstName = sc.next();
			                            System.out.print("Enter new last name: ");
			                            String newLastName = sc.next();
			                            System.out.print("Enter new date of birth (DD-MM-YYYY): ");
			                            String dateStr = sc.next();
			                            SimpleDateFormat sdf;
			                            sdf = new SimpleDateFormat("dd-MM-yyyy");
			                            java.util.Date uDate = sdf.parse(dateStr);
			                            java.sql.Date sDate;
			                            sDate = new java.sql.Date(uDate.getTime());
			                            stmt.setDate(1,sDate);
			                            
			                            stmt.setString(1, newFirstName);
			                            stmt.setString(2, newLastName);
			                            stmt.setDate(3, sDate);
			                            stmt.setInt(4, id);
			                            
			                            int count = stmt.executeUpdate();
			                            System.out.println("Rows Affected: " + count);
			                            
			                            
									}
								} else {
									System.out.println("Only voters can be updated");
								}
							} else {
								System.out.println("User not found");
							}
						}
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
			}
		}

	}

}

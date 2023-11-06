package com.sunbeam;

import java.sql.*;
import java.util.*;

public class Tester {
	
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/javapractice";
	public static final String DB_USER = "D2_80418_Vaishnavi";
	public static final String DB_PASSWORD = "80418";
	
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("====================================");
		System.out.println("1. Insert new candidate");
		System.out.println("2. Display all candidates");
		System.out.println("3. Increment votes of candidate with given id");
		System.out.println("4. Delete candidate with given id");
		System.out.println("5. Find candidate of given id");
		System.out.println("6. Find candidates of given party");		
		System.out.println("7. Display total votes for each party");
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
					String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.print("Enter name : ");
						String name = sc.next();
						System.out.print("Enter Party : ");
						String party = sc.next();
						System.out.println("Enter Votes : ");
						int votes = sc.nextInt();
						
						stmt.setString(1, name);
						stmt.setString(2, party);
						stmt.setInt(3, votes);
						
						int count = stmt.executeUpdate();
						System.out.println("Rows Affected: "+count);
						
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 2:
				try (Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "SELECT * FROM candidates";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						try(ResultSet rs = stmt.executeQuery()){
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						}		
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 3:
				try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "UPDATE candidates set votes = votes+1 where id = ?";
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
					String sql = "DELETE from candidates where id = ?";
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
				try (Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "SELECT * FROM candidates where id=?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.print("Enter id : ");
						int id1 = sc.nextInt();
						stmt.setInt(1, id1);
						try(ResultSet rs = stmt.executeQuery()){
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						}		
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 6:
				try (Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "SELECT * FROM candidates where party=?";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						System.out.print("Enter party name : ");
						String party1 = sc.next();
						stmt.setString(1, party1);
						try(ResultSet rs = stmt.executeQuery()){
							while(rs.next()) {
								int id = rs.getInt("id");
								String name = rs.getString("name");
								String party = rs.getString("party");
								int votes = rs.getInt("votes");
								System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
							}
						}		
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;
			case 7:
				try (Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD)){
					String sql = "SELECT party,sum(votes) as sum_votes FROM candidates group by party";
					try(PreparedStatement stmt = con.prepareStatement(sql)){
						try(ResultSet rs = stmt.executeQuery()){
							while(rs.next()) {
								String party = rs.getString("party");
								int votes = rs.getInt("sum_votes");
								System.out.printf(" %s, %d\n", party, votes);
							}
						}		
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
		}
		
	}

}

package com.sunbeam;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class UsersDAO implements AutoCloseable{
	private Connection con;
	private PreparedStatement addUser;
	private PreparedStatement displayAll;
	private PreparedStatement deleteVoterById1;
	private PreparedStatement deleteVoterById2;
	private PreparedStatement changeStatus;
	private PreparedStatement changeVoter;
	
	
	public UsersDAO() throws Exception {
		con = DBUtil.getConnection();
		
		String sql1 = "INSERT INTO users values(default,?,?,?,?,?,?,?)";
		addUser = con.prepareStatement(sql1);
		
		String sql2 = "Select * from users";
		displayAll = con.prepareStatement(sql2);
		
		String sql3 = "select * from users where id=?";
		deleteVoterById1 = con.prepareStatement(sql3);
		
		String sql4 = "delete from users where id=?";
		deleteVoterById2 = con.prepareStatement(sql4);
		
		String sql5 = "update users set status=true where id=?";
		changeStatus = con.prepareStatement(sql5);
		
		String sql6 = "update users set first_name=?,last_name=?,dob=? where id=?";
		changeVoter = con.prepareStatement(sql6);
	}

	@Override
	public void close() throws Exception {
		try {
			if(con!=null) {
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int addUser(Users u) throws Exception {
		addUser.setString(1,u.getFirst_name());
		addUser.setString(2,u.getLast_name());
		addUser.setString(3,u.getEmail());
		addUser.setString(4,u.getPassword());
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate = sdf.parse(u.getDob());
		java.sql.Date sDate;
		sDate = new java.sql.Date(uDate.getTime());
		addUser.setDate(5,sDate);
		addUser.setBoolean(6, u.isStatus());
		addUser.setString(7,u.getRole());
		int count = addUser.executeUpdate();
		return count;
	}
	
	public List<Users> displayAll() throws Exception{
		List<Users> list = new ArrayList<Users>();
		try(ResultSet rs = displayAll.executeQuery()){
			while(rs.next()) {
				int id = rs.getInt("id");
				String first_name = rs.getString("first_name");
				String last_name = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				String dob = rs.getString("dob");
//				java.sql.Date sDate = rs.getDate("dob");
//				java.util.Date uDate = new java.util.Date(sDate.getTime());
				boolean status = rs.getBoolean("status");
				String role=rs.getString("role");
				Users u = new Users(id,first_name,last_name,email,password,dob,status,role);
				list.add(u);
			}
		}
		return list;
	}
	
	public int deleteVoter(int id) throws Exception {
		deleteVoterById1.setInt(1, id);
		try(ResultSet rs = deleteVoterById1.executeQuery()){
			if (rs.next()) {
				String role = rs.getString("role");
				if ("voter".equals(role)) {
					deleteVoterById2.setInt(1, id);
					int count = deleteVoterById2.executeUpdate();
					return count;	
					
				} else {
					System.out.println("Only Voters can be deleted");
					return 0;
				}
			} else {
				System.out.println("User not found");
				return 0;
			}
		}	
	}
	
	public int changeStatus(int id) throws Exception {
		deleteVoterById1.setInt(1, id);
		try(ResultSet rs = deleteVoterById1.executeQuery()){
			if (rs.next()) {
				String role = rs.getString("role");
				if ("voters".equals(role)) {
					changeStatus.setInt(1, id);
					int count = changeStatus.executeUpdate();
					return count;	
					
				} else {
					System.out.println("Only Voters can be deleted");
					return 0;
				}
			} else {
				System.out.println("User not found");
				return 0;
			}
		}	
	}
	
	public int changeVoter(int id,String first_name,String last_name,String dob) throws Exception {
		deleteVoterById1.setInt(1, id);
		try(ResultSet rs = deleteVoterById1.executeQuery()){
			if (rs.next()) {
				String role = rs.getString("role");
				if ("voters".equals(role)) {
					String dateStr = dob;
                    SimpleDateFormat sdf;
                    sdf = new SimpleDateFormat("dd-MM-yyyy");
                    java.util.Date uDate = sdf.parse(dateStr);
                    java.sql.Date sDate;
                    sDate = new java.sql.Date(uDate.getTime());
                    changeVoter.setDate(1,sDate);
                    
                    changeVoter.setString(1, first_name);
                    changeVoter.setString(2, last_name);
                    changeVoter.setDate(3, sDate);
                    changeVoter.setInt(4, id);
                    
                    int count = changeVoter.executeUpdate();
                    return count;	
					
				} else {
					System.out.println("Only Voters can be deleted");
					return 0;
				}
			} else {
				System.out.println("User not found");
				return 0;
			}
		}	
	}
}

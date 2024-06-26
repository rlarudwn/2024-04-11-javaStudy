package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	public static MemberDAO dao;
	private final String URL = "jdbc:oracle:thin:@192.168.10.124:1521:XE";
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {}
	}
	
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr3", "happy");
		}catch(Exception e) {}
	}
	
	public void disConnection() {
		try {
			if(conn != null) conn.close();
			if(ps != null) ps.close();
		} catch (Exception e) {
		}
	}
	
	public static MemberDAO newInstance() {
		if(dao == null)
			dao = new MemberDAO();
		return dao;
	}
	
	public String memberLogin(String id, String pwd) {
		String result = "";
		try {
			getConnection();
			String sql = "SELECT COUNT(*) FROM member WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			rs.close();
			if(count == 0) {
				result = "NO ID";
			}
			else {
				sql = "SELECT pwd, admin FROM member WHERE id = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				rs.next();
				String pwd_temp = rs.getString(1);
				
				
				if(pwd_temp.equals(pwd)) {
					result = rs.getString(2);
				}
				else {
					result = "NO PWD";
				}
				rs.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			disConnection();
		}
		return result;
	}
	
	public String[] getEmp() {
		ArrayList<String> list1 = new ArrayList<String>();
		
		try {
			getConnection();
			String sql = "SELECT ename, empno FROM emp";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				list1.add(rs.getInt(2) + ". " + rs.getString(1));
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
		String[] list2 = list1.toArray(new String[list1.size()]);
		
		return list2;
	}
	
	public void updatePerformance(int empno, int stack) {
		try {
			getConnection();
			String sql = "UPDATE emp SET PERFORMANCE = PERFORMANCE + ? WHERE empno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, stack);
			ps.setInt(2, empno);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			disConnection();
		}
	}
}

package com.lcy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lcy.entity.admin;
import com.lcy.entity.staff;
import com.lcy.service.*;

public class logindao {
	//判断是否为管理者
	public admin judgeadmin(String id,String pwd) throws SQLException {
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		admin ad = null;
		
		
		try {
			conn = (Connection) jdbc.getConnection();
			sta = (Statement) conn.createStatement();
			String sql = "select * from admin where id = '"+id+"'and pwd = '"+pwd+"'";
			rs = sta.executeQuery(sql);
			while(rs.next()) {
				ad = new admin();
				ad.setId(rs.getString(1));
				ad.setPwd(rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			// TODO Auto-generated catch block
			jdbc.release(rs,sta, conn);
		}
		return ad;
	}
	
	
	
	//判断是否为用户
	public staff judgestaff(String id,String pwd) throws SQLException {
		
		
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		staff st = null;
		
		
		try {
			conn = (Connection) jdbc.getConnection();
			sta = (Statement) conn.createStatement();
			String sql = "select * from staff where id = '"+id+"'and pwd = '"+pwd+"'";
			rs = sta.executeQuery(sql);
			while(rs.next()) {
				st = new staff();
				st.setId(rs.getString(1));
				st.setPwd(rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			// TODO Auto-generated catch block
			jdbc.release(rs,sta, conn);
		}
		return st;
	}
		
		
		
	}
	
	
	
	


package com.lcy.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.lcy.service.JDBC;


public class delstaffdao {
	
	public void delstaff_id(String id) throws ClassNotFoundException, SQLException {
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta_s = null;
		Statement sta_i = null;
		
		String sql_s ="delete from staff where id = '"+id+"'";
		String sql_i ="delete from info where id = '"+id+"'";
		
		
		conn = jdbc.getConnection();
		sta_s = conn.createStatement();
		sta_i = conn.createStatement();
		
		sta_i.executeUpdate(sql_i);
		sta_s.executeUpdate(sql_s);
		
		jdbc.release(sta_i, conn);
		jdbc.release(sta_s, conn);				
		
	}

	
	
	public void delstaff_name(String name) throws ClassNotFoundException, SQLException {
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta = null;
		
		String sql ="delete from info where name = '"+name+"'";
		
		
		conn = jdbc.getConnection();
		sta = conn.createStatement();
		
		sta.executeUpdate(sql);
		
		jdbc.release(sta, conn);				
		
	}
	
	
}

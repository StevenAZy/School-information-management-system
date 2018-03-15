package com.lcy.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.lcy.service.JDBC;

public class addstaffdao {
	public void addstaff(String id ,String pwd) throws ClassNotFoundException, SQLException {
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta = null;
		String sql = "insert into staff values('"+id+"','"+pwd+"') ";		
		
		
		
		conn = jdbc.getConnection();
		sta =  conn.createStatement();		
		
		
		sta.executeUpdate(sql);
		
		jdbc.release(sta, conn);
	}
	
	public void addinfo(String id,String name,String depart,String position,String title,String email,String reward,String family) throws ClassNotFoundException, SQLException {
		
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta = null;
		String sql = "insert into info values('"+id+"','"+name+"','"+depart+"','"+position+"','"+title+"','"+email+"','"+reward+"','"+family+"') ";
		
		conn = jdbc.getConnection();
		sta =  conn.createStatement();		
		
		
		sta.executeUpdate(sql);
		
		jdbc.release(sta, conn);
		
		
	}
	
	
	
	
	
}

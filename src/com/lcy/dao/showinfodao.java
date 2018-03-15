package com.lcy.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lcy.entity.staff;
import com.lcy.service.JDBC;

public class showinfodao {
	
	public List<staff> showinfo() throws SQLException, ClassNotFoundException {
		JDBC jdbc = new JDBC();
		Connection conn = null;
		Statement sta = null;
		ResultSet rs = null;
		conn = jdbc.getConnection();
		
		String sql = "select * from info";		
		sta = conn.createStatement();		
		rs = sta.executeQuery(sql);
		
		
		List<staff> list = new ArrayList<staff>();
		try {
			while (rs.next()) {
				
				staff st=new staff();
				st.setId(rs.getString(1));
				st.setName(rs.getString(2));
				st.setDepart(rs.getString(3));
				st.setPosition(rs.getString(4));
				st.setTitle(rs.getString(5));
				st.setEmail(rs.getString(6));
				st.setReward(rs.getString(7));
				st.setFamily(rs.getString(8));
				list.add(st);
			}
		jdbc.release(sta, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	
}

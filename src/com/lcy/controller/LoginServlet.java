package com.lcy.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcy.dao.logindao;
import com.lcy.dao.modinfodao;
import com.lcy.dao.showinfodao;
import com.lcy.entity.admin;
import com.lcy.entity.staff;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String p0 = "/pages/login.jsp";
		String p1 = "/pages/admin.jsp";
		String p2 = "/pages/staff.jsp";
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");		
		
		logindao log = new logindao();
		admin ad = null;
		staff st = null;
		
		try {
			ad = log.judgeadmin(id, pwd);
			st = log.judgestaff(id, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(ad == null&&st == null) {
			request.getRequestDispatcher(p0).forward(request, response);
		}else if(ad !=null&&st == null){
			//request.setAttribute("id", id);
			request.getRequestDispatcher(p1).forward(request, response);
		}else {
			
			modinfodao mf = new modinfodao();
			try {
				request.setAttribute("staff", mf.modinfo(id));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			request.getRequestDispatcher(p2).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

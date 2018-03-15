package com.lcy.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lcy.dao.delstaffdao;

/**
 * Servlet implementation class DelstaffServlet
 */
@WebServlet("/DelstaffServlet")
public class DelstaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DelstaffServlet() {
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
		
		String id = null;
		 id = request.getParameter("id");
		String name =  null;
		name = request.getParameter("name");
		
		String p1 = "/pages/delsuccess.jsp";
		
		delstaffdao del = new delstaffdao();
		
		
		if(name != ""&&id == "") {
			try {
				del.delstaff_name(name);
				request.getRequestDispatcher(p1).forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(id != ""&&name == "") {
			try {
				del.delstaff_id(id);
				request.getRequestDispatcher(p1).forward(request, response);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

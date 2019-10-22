package com.virtusa.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virtusa.dao.ManagerDAOImpl;
import com.virtusa.entities.User;

/**
 * Servlet implementation class MgrViewIntServlet
 */
@WebServlet("/MgrViewIntServlet")
public class MgrViewIntServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MgrViewIntServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ServletContext sct=getServletContext();
		RequestDispatcher rd1=sct.getRequestDispatcher("/Manager.jp");
		rd1.include(request, response);
		
		ManagerDAOImpl mg=new ManagerDAOImpl();
			List<User> rs=mg.assignInterviewer();
			
		out.println("<centre><table border=1 width=50% height=50%></centre>");
		out.println("</br><tr><th>Interviewer_id</th><th>userName</th><th>Assign Interviewers</th><tr>");
		
		try {
			while(rs.next()) String interviewer_id=rs.getString("interviewer_id");
				String userName=rs.getString("userName");
				
				out.println(<tr><td>"+id+"</td><td>"+userName+"</td><td><a href=AssignInterviewers?id="+id+">Assign Interviewers</a></td><td>");
				
			}catch(SQLException e){
				e.printStackTrace();
			}
				
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

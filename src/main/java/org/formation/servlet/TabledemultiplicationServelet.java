package org.formation.servlet;
import java.io.IOException;
import java.time.LocalTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Tabledemultiplication")
public class TabledemultiplicationServelet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
	//	int  val=7;
		req.setAttribute("name", 7);
		req.getRequestDispatcher("/jsp/Tabledemultiplication.jsp").forward(req, resp);
		
	}
}

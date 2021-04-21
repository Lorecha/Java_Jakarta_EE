package org.formation.servlet;

import jakarta.servlet.http.HttpServlet;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.PushBuilder;
import java.time.*;

@WebServlet("/Horologe")
public class HorologeServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException {
		LocalTime time=LocalTime.now(); 
	//	req.setAttribute("Il est :", "");
		//PrintWriter writer = resp.getWriter();
	//	writer.println("Le temps local est :");
	//	writer.print(time);
		req.setAttribute("name", time);
		req.getRequestDispatcher("/jsp/Horologe.jsp").forward(req, resp);
		
	}

}

package org.jspiders.javApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fs")
public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		Cookie cookie=new Cookie("CookieName", name);
		cookie.setMaxAge(60*2);
		resp.addCookie(cookie);
		PrintWriter printWriter=resp.getWriter();
		printWriter.println("<html><body bgcolor='cyan'>"
				+ "<form action='ss'><h1 align='center'> <input type='submit' value='NextServlet'></h1>"
				+ "</body></html>");
		printWriter.flush();
		printWriter.close();
	}

}

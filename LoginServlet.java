package com.example.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>Login successful. You have access to the system.</p>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid Username or Password!</h2>");
            out.println("<a href='login.html'>Try Again</a>");
            out.println("</body></html>");
        }

        out.close();
    }
}

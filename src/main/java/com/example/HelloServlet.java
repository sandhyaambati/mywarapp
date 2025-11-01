package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // TEST ISSUES FOR SONAR
        System.out.println("Debug: Servlet accessed"); // Code smell
        String password = "admin123"; // Security Hotspot
        int unusedValue = 42; // Unused variable

        try {
            int result = 10 / 0; // Force exception
        } catch (Exception e) {
            // Empty catch (Code smell)
        }

        out.println("<html><body>");
        out.println("<h1>Welcome to My WAR Project!</h1>");
        out.println("<a href='index.jsp'>Go to UI Page</a>");
        out.println("</body></html>");
    }
}

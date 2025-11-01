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
            throws ServletException {

        // Set content type
        response.setContentType("text/html");

        // Use try-with-resources to automatically close PrintWriter
        try (PrintWriter out = response.getWriter()) {

            // Write HTML response
            out.println("<html><body>");
            out.println("<h1>Welcome to My WAR Project!</h1>");
            out.println("<a href='index.jsp'>Go to UI Page</a>");
            out.println("</body></html>");

        } catch (IOException e) {
            // Handle exception explicitly for Sonar compliance
            throw new ServletException("Error writing response", e);
            // Optionally, send an error response
            try {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                               "Unable to generate response");
            } catch (IOException ex) {
                log("Failed to send error response: " + ex.getMessage(), ex);
            }
        }
    }
}


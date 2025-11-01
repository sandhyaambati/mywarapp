package com.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(HelloServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("text/html");

        // Use try-with-resources to automatically close PrintWriter
        try (PrintWriter out = response.getWriter()) {

            // HTML response
            out.println("<html><body>");
            out.println("<h1>Welcome to My WAR Project!</h1>");
            out.println("<a href='index.jsp'>Go to UI Page</a>");
            out.println("</body></html>");

        } catch (IOException e) {
            // Log the exception
            LOGGER.log(Level.SEVERE, "IOException while writing response", e);

            // Send proper HTTP error to client
            try {
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
                                   "Unable to generate response");
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, "Failed to send error response", ex);
            }
        }
    }
}



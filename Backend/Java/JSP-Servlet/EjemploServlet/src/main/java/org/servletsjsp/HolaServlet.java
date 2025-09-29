package org.servletsjsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class HolaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>¡Hola desde el Servlet!</h1>");
    }
}
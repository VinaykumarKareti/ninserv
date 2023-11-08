package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class InitParamServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the "ServletContext Initialization Parameter" defined in web.xml
        String paramName = getServletContext().getInitParameter("paramName");

        // Retrieve the data submitted from the HTML form
        String name = request.getParameter("name");

        // Set the response content type
        response.setContentType("text/html");

        // Create a PrintWriter to write the response
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Servlet Response</title></head>");
        out.println("<body>");
        out.println("<h1>ServletContext Initialization Parameter:</h1>");
        out.println("<p>" + paramName + "</p>");
        out.println("<h1>Form Data Submitted:</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

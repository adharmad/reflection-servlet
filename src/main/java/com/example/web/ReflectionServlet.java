package com.example.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by adharmad on 5/26/18.
 */
public class ReflectionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doGet(request, response);

        response.setContentType("text/html");
        // Writing the message on the web page
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello</h1>");
        out.println("<p>" + "Hello Friends!" + "</p>");
    }
}

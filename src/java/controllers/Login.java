/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author George.Pasparakis
 */
@WebServlet(name = "login", urlPatterns = {"/login", "/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException { 
         // here you listen for POST method
         
        response.setContentType("text/html;charset=UTF-8"); // servlet
        try (PrintWriter out = response.getWriter()) {
            /* for the browser */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Administration Panel - Precious EShop</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Administration Panel - Precious EShop" + "</h1>");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if(username.equalsIgnoreCase("admin") && password.equals("admin")) {
                out.println("Welcome " + username + " to the app!" + " Your password is: " + password);
            }
            out.println("</body>");
            out.println("</html>");
        }
     
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ProductService;
import services.ResultService;

/**
 *
 * @author George.Pasparakis
 */
@WebServlet(name = "product", urlPatterns = {"/product"})
public class Product extends HttpServlet {
    ProductService ps;
    ResultService resultService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/newproduct.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        if(ps == null) ps = new ProductService();
        if(resultService == null) resultService = new ResultService();
        models.Product product = new models.Product();
        product.setName(req.getParameter("name"));
        product.setPrice(Double.parseDouble(req.getParameter("price")));
        product.setQuantity(Integer.parseInt(req.getParameter("quantity")));
        int result = ps.insert(product);
        resultService.showInsertResult(req, resp, result, product);
    }
    
    
    
    
    
    
}

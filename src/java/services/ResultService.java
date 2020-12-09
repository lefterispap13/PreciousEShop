/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Customer;
import models.Product;

/**
 *
 * @author George.Pasparakis
 */
public class ResultService implements IResultService {

    @Override
    public void showInsertResult(HttpServletRequest req, HttpServletResponse resp, int errorCode, Product product) {
        RequestDispatcher rd;
        rd = req.getRequestDispatcher("WEB-INF/views/insertproductresult.jsp");
        req.setAttribute("isError", errorCode == 0); // (errorCode == 0) ? true : false);
        req.setAttribute("errorCode", errorCode);
        req.setAttribute("errorMessage", (errorCode == 0) ? "Product was not successfuly inserted!" : "Product successfuly inserted!");
        req.setAttribute("product", product);
        try {
            rd.forward(req, resp);
        } catch (ServletException ex) {
            Logger.getLogger(ResultService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ResultService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void showInsertResult(HttpServletRequest req, HttpServletResponse resp, int errorCode, Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

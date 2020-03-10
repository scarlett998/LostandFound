/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import database_Project.Lostandfound;
import database_Project.LostandfoundFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suxia
 */
public class chooseStuff extends HttpServlet {

    @EJB
    private LostandfoundFacadeLocal lostandfoundFacade;
 
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         List<Lostandfound> stuff=lostandfoundFacade.findAll();
          List<String> it=new ArrayList();
       Lostandfound e=new Lostandfound();
        int counter=0;
        
        response.setContentType("text/html;charset=UTF-8");
         String button = request.getParameter("button"); 
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet chooseStuff</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("  <form action=\"sendEmail\" method=\"Post\">");
              for(Lostandfound g:stuff){
            counter++;
              if (String.valueOf(counter).equals(button)) {
           out.println("<font size=\"7\" color=\"red\">"+g.getName() +"</font><br><br>");
           out.println("<font color=\"blue\">the brand is:</font>   "+g.getBrand() +"<br>");
           out.println( "<font color=\"blue\">the color is:</font>  "+g.getColor()+"<br>");
           out.println( "<font color=\"blue\">the pattern is:</font>   "+g.getPattern()+"<br>");
           out.println( "<font color=\"blue\">the length is:</font>   "+g.getLength()+"<br>");
           out.println( "<font color=\"blue\">the width is:</font>   "+g.getWidth()+"<br>");
           out.println( "<font color=\"blue\">the found address is:</font>   "+g.getAddress()+"<br>");
           out.println( "<font color=\"blue\">the found date is:</font>   "+g.getDate()+"<br>");
           out.println( "<font color=\"blue\">and description is:</font>   "+g.getDescription()+"<br>");
           out.println( "<font size=\"5\" color=\"red\">current status:   "+g.getStatus()+"</font><br><br>");
            out.println("<br>if you think this stuff is yours, please enter your email:<br><input type=\"text\" name=\"email\"><br>");     
           
           out.println("<button type=\"submit\" value="+counter+" name=\"button\"/>OK, send email</button>");     
           }       
            }
              out.print("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

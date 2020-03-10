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
public class officeServlet extends HttpServlet {

     @EJB
    private LostandfoundFacadeLocal lostandfoundFacade;
     
     boolean asd=true;
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
          List<String> it=new ArrayList();
       Lostandfound e=new Lostandfound();
       String button = request.getParameter("button"); 
        List<Lostandfound> s=lostandfoundFacade.findAll();
         for(Lostandfound g:s){
            if (Integer.parseInt(request.getParameter("item_ID"))==g.getStuffID()){
                asd=false;
            }
            }
         if (asd==true){
          e.setStuffID(Integer.parseInt(request.getParameter("item_ID")));
      e.setName(request.getParameter("name"));
        e.setColor(request.getParameter("color"));
      e.setBrand(request.getParameter("brand"));
     e.setPattern(request.getParameter("pattern"));
     e.setLength(request.getParameter("length"));
     e.setWidth(request.getParameter("width"));
     e.setAddress(request.getParameter("address"));
     e.setDate(request.getParameter("date"));
      e.setDescription(request.getParameter("description"));
      e.setStatus("Not received");
      
      if ("add".equals(button)) {
          lostandfoundFacade.create(e);
      }
         }else if("remove".equals(button)){
             
          e.setStuffID(Integer.parseInt(request.getParameter("item_ID")));
      e.setName(request.getParameter("name"));
        e.setColor(request.getParameter("color"));
      e.setBrand(request.getParameter("brand"));
     e.setPattern(request.getParameter("pattern"));
     e.setLength(request.getParameter("length"));
     e.setWidth(request.getParameter("width"));
     e.setAddress(request.getParameter("address"));
     e.setDate(request.getParameter("date"));
      e.setDescription(request.getParameter("description"));
      e.setStatus("received");
      lostandfoundFacade.edit(e);
        //  lostandfoundFacade.remove(e);
          asd=true;
      }
      
      List<Lostandfound> stuff=lostandfoundFacade.findAll();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>office_list</title>");  
           
            out.println("<style type=\"text/css\">");
            out.println("table tr td,th{border:1px solid #000;}");
             out.println("</style>");
             
            out.println("</head>");
            out.println("<body>");
            if (asd==true){
            
            out.println("<table>");
            
            out.println("<tr>");
            
            out.println("<th>stuff ID</th>");
            out.println("<th>name</th>");
            out.println("<th>brand</th>");
            out.println("<th>color</th>");
            out.println("<th>pattern</th>");
            out.println("<th>length</th>");
            out.println("<th>width</th>");
            out.println("<th>addrss</th>");
            out.println("<th>date</th>");
            out.println("<th>description</th>");
            out.println("<th>status</th>");
            out.println("</tr>");
             for(Lostandfound g:stuff){
                 
           out.println("<tr>");
           out.println("<th>"+g.getStuffID()+"</th>");   
           out.println("<th>"+g.getName()+"</th>");
           out.println("<th>"+g.getBrand() +"</th>");
           out.println( "<th>"+g.getColor()+"</th>");
           out.println( "<th>"+g.getPattern()+"</th>");
           out.println( "<th>"+g.getLength()+"</th>");
           out.println( "<th>"+g.getWidth()+"</th>");
           out.println( "<th>"+g.getAddress()+"</th>");
           out.println( "<th>"+g.getDate()+"</th>");
           out.println( "<th>"+g.getDescription()+"</th>");
           out.println( "<th>"+g.getStatus()+"</th>");
           
            out.println("</tr>");
            }
            
            
            out.println("</table>");

            }else if(asd==false){
                out.println("<h1> your stuff_ID is same as before, please change a new ID</h1>");
            }
            
            asd=true;
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

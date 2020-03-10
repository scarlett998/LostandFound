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
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suxia
 */
public class sendEmail extends HttpServlet {

    @EJB
    private LostandfoundFacadeLocal lostandfoundFacade;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        String button = request.getParameter("button");
        String email=request.getParameter("email");
        
         
        List<Lostandfound> stuff=lostandfoundFacade.findAll();
          List<String> it=new ArrayList();
       Lostandfound e=new Lostandfound();
       
        int counter=0;
        for(Lostandfound g:stuff){
            counter++;
            
         if (String.valueOf(counter).equals(button)) {
             String a=g.getName() + "*" +g.getBrand()+ "*" +g.getColor()+ "*"+g.getLength()+"*"+g.getWidth()+ "*"+g.getPattern()+"*"+g.getAddress()+"*"+g.getDate()+ "*"+g.getDescription()+"*"+email;
             sendMessage(a);
         }
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sendEmail</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + "your email is send to office, we will context you" + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }}
    
     private void sendMessage(String message) throws IOException {
        try {
            Context ctx = new InitialContext();

            ConnectionFactory connectionFactory = (ConnectionFactory) ctx.lookup("jms/office");
            Queue queue = (Queue) ctx.lookup("jms/lostThing");

            javax.jms.Connection connection = connectionFactory.createConnection();
            javax.jms.Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageProducer messageProducer = session.createProducer(queue);
            TextMessage JMSmessage = session.createTextMessage();
            JMSmessage.setText(message);
            System.out.println("***** RegServlet: Sent the message to YourQueue:" + JMSmessage.getText());
            messageProducer.send(JMSmessage);
        } catch (Exception ex) {
            ex.printStackTrace();
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

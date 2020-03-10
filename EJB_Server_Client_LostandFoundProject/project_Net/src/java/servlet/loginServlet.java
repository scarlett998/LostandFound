/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author scarlett
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        String button=request.getParameter("button");
        
        if ("login".equals(button)) {
             HttpSession session = request.getSession();
             
              String username = request.getParameter("username");
              String password = request.getParameter("password");
              if(username.equalsIgnoreCase("office")&&password.equalsIgnoreCase("office")){
                  RequestDispatcher rd = request.getRequestDispatcher("/officeAdd.jsp");//改转到office的网页
              rd.forward(request, response);
              
              }else{
                   RequestDispatcher rd = request.getRequestDispatcher("/lnf.jsp");
              rd.forward(request, response);
              
              }
// session.setAttribute("username", username);
//  session.setAttribute("password", password);
//            String username = request.getParameter("username");
////            // 它是一种取参数的方法。把jsp文件中的数据读取到出来。然后就可以封装利用起来。
//           String password = request.getParameter("password");
////            
//
//            // Username is 6 - 8 characters long and password is atleast 1 character.
//            if (!username.isEmpty() ) {
//                // Correct account give access
//                if (!password.isEmpty()) {
//                    //转页面啦
//                   
//                    RequestDispatcher rd = request.getRequestDispatcher("/lnf.jsp");
//                    rd.forward(request, response);
//                    session.setAttribute("username",username);
//                    session.setAttribute("password", password);
//                    
//                }
//                else {
//                    // wrong credentials
//                    request.setAttribute("errorMessage", "Wrong credentials");
//                    RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
//                    rd.forward(request, response);  
//                }
//            }
//            else {
//                // username less than 6 characters or more than 8 characters
//                request.setAttribute("errorMessage", "Username and password cannot be blank");
//                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
//                rd.forward(request, response);  
//            }
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

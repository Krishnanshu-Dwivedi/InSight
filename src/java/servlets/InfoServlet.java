/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd ;
        String username=request.getParameter("uname");
        String userid=request.getParameter("uid");
        String password=request.getParameter("upwd");
        String phone = request.getParameter("pno");
        if(username.isEmpty() || userid.isEmpty() || password.isEmpty() || phone.isEmpty())
        {  rd= request.getRequestDispatcher("error.jsp");
          rd.forward(request, response);
        }
     
            String name = servlets.SignupModel.getData(username,userid,password,phone);
        
                
//           if(BookList.isEmpty()){
//               rd= request.getRequestDispatcher("nobooks.jsp");
//               request.setAttribute("subject", subject);
//               rd.forward(request, response);
//           }
//           else{
               rd=request.getRequestDispatcher("showName.jsp");
               request.setAttribute("username", name);
//               request.setAttribute("BookList", BookList);
               rd.forward(request, response);
        
        }
//        
//        User u = new User(username,userid,password,phone);
//        RequestDispatcher rd = request.getRequestDispatcher("SignupModel.java");
//        ArrayList <String> arr = new ArrayList<>();
//        arr.add(username);
//        arr.add(userid);
//        arr.add(password);
//        arr.add(phone);
//        request.setAttribute("name", username);
//        request.setAttribute("id", userid);
//        request.setAttribute("pwd", password);
//        request.setAttribute("phone", phone);
//        //request.setAttribute("name", username);
//        rd.forward(request, response);
//        }
//    
//   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param requestuest servlet requestuest
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest requestuest, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(requestuest, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param requestuest servlet requestuest
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest requestuest, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(requestuest, response);
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

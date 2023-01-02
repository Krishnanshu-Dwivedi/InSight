/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static servlets.User.name;

public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd ;
        String userid=request.getParameter("uid");
        String password=request.getParameter("upwd");
        if( userid.isEmpty() || password.isEmpty() )
        {  rd= request.getRequestDispatcher("error.jsp");
          rd.forward(request, response);
        }
     
            List<String> ls = (List<String>)servlets.LoginModel.getData(userid,password);
        

               rd=request.getRequestDispatcher("afterSignin.jsp");
               request.setAttribute("data", ls);
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


//import javax.servlet.*;
//import javax.servlet.http.*;
//import java.sql.*;
//import java.io.*;
//import java.util.ArrayList;
// 
//public class LoginServlet extends HttpServlet{
//   private Connection conn= null;
//   private PreparedStatement ps= null;
//   
//   public void init() throws ServletException
//   {
//       ServletContext ctxt = super.getServletContext();
//      
//       String qry="select name,userid,password,phone from insight where userid=? and password=?";
//       try{
//              conn = (Connection) ctxt.getAttribute("dbConn");
//            
//              ps=conn.prepareStatement(qry);
//
//                 
//          }
//       catch(Exception ex){
//           
//           System.out.println("Problem in iniiit"+ ex.getMessage());
//           ServletException obj= new ServletException();
//           throw obj;
//       }
//   }
//   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
//   {
//       PrintWriter pw = resp.getWriter();
//        pw.println("<html> ");
//        pw.println("<head> ");
//        pw.println(" <title>My datetime  servlet </title> ");
//        pw.println(" <style> h1{color:white; margin-top:20%;} body{text-align:center; background-color:pink;} </style>");
//		
//        pw.println(" </head> ");
//        pw.println(" <body> ");
//        String userid=req.getParameter("uid");
//        String password=req.getParameter("upwd");
//        try{
//            ps.setString(1, userid);
//            ps.setString(2, password);
//            ResultSet rs= ps.executeQuery();
//            if(rs.next()){
//                String username=rs.getString(1);
//                String id = rs.getString(2);
//                String pass =rs.getString(3);
//                String phone=rs.getString(4);
//                RequestDispatcher rd = req.getRequestDispatcher("afterSignin.jsp");
//                ArrayList <String> ls = new ArrayList<>();
//                ls.add(username);
//                ls.add(id);
//                ls.add(pass);
//                ls.add(phone);
//                req.setAttribute("data", ls);
//                rd.include(req, resp);
//                
//               
//            }
//            else{
//                    pw.println("<h2> Invalid Id or Password . </h2>");
//                    pw.println("<h2>Do not have an account ? please <a href = 'sign-up.html'>sign up</a></h2>");
//                    pw.println("<h2> Please <a href='Sign-in.html'> try again</a> </h2>");
//                    }
//        }
//        catch(SQLException s){
//            pw.println("<p> our server is facing some issues . Please try again after some times..</p>");
//        }
//         pw.println(" </body> ");
//        pw.println(" </html> ");
//        pw.close();
//   }
//  public void destroy(){
//      try{
//          conn.close();
//          System.out.println("Connection closed..");
//      }
//      catch(SQLException s){
//          System.out.println("problem in closing the database"+ s.getMessage());
//      }
//  }
//   
//}

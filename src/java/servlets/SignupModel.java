package servlets;
//import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import servlets.User;
 
public class SignupModel{
    private static Connection conn=MyDBListener.conn;
   
 
   public static String getData(String n,String id,String pwd ,String no){
      
      PreparedStatement ps;
       try{
           ps = conn.prepareStatement("insert into insight values(?,?,?,?)");
           ps.setString(1, n);
           ps.setString(2, id); 
           ps.setString(3, pwd);
           ps.setString(4, no);
           
           int ans = ps.executeUpdate();
            if(ans==1){
                return n;
            }
            else{
                   return "no update";
                    }
        }
        catch(SQLException s){
            System.out.println(s.getMessage());
        }
          

          finally{
           return n;
       }
       
   }
   public static void closeConnection(){
       try{
        conn.close();
           System.out.println("connection closed");
       }
       catch(SQLException e){
           System.out.println("error while closing conn"+e);
       }
           
       }


    
            
//   private Connection conn= null;
//   private PreparedStatement ps= null;
//   
//   public void init() throws ServletException
//   {
//       try{
//           Class.forName("oracle.jdbc.OracleDriver");
//           System.out.println("Driver loaded");
//           conn= DriverManager.getConnection("jdbc:oracle:thin:@//Krishnanshu-Dwivedi:1521/xe","advjava","java");
//           System.out.println("connection opened..");
//           ps=conn.prepareStatement("insert into insight values(?,?,?,?)");
//          }
//       catch(Exception ex){
//           System.out.println("Problem in init"+ ex.getMessage());
//           ServletException obj= new ServletException("Problem in init()");
//           throw obj;
//       }
//   }
//   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException,ServletException
//   {
//       
//        String username=User.getName();
//        String userid=User.getUserId();
//        String password=User.getPassword();
//        String phone= User.getPhone();
//        try{
//           ArrayList <String> data = ( ArrayList<String> ) req.getAttribute("list");
//            ps.setString(1,data.get(1));
//           
//            ps.setString(2, data.get(2));
//            ps.setString(3, data.get(3));
//             ps.setString(4, data.get(4));
//            int ans= ps.executeUpdate();
//            if(ans==1){
//               RequestDispatcher rd = req.getRequestDispatcher("showName.jsp");
//               req.setAttribute("username", data.get(1));
//               rd.include(req, resp);
//            }
//            else{
//                   resp.sendRedirect("error.jsp");
//                    }
//        }
//        catch(SQLException s){
//            System.out.println(s.getMessage());
//        }
//      
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
}


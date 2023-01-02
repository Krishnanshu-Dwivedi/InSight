package servlets;
//import javax.servlet.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import oracle.net.aso.n;
 
public class LoginModel{
    private static Connection conn= MyDBListener.conn;
   public static List<String> getData(String id,String pwd ){
      
      PreparedStatement ps;
      List <String> ls = new ArrayList<>();
       try{
           ps = conn.prepareStatement("select name,userid,password,phone from insight where userid=? and password=?");
           ps.setString(1, id); 
           ps.setString(2, pwd);
           ResultSet rs = ps.executeQuery();
           if(rs.next()){
              ls.add(rs.getString(1)) ;
              ls.add(rs.getString(2)); 
               ls.add(rs.getString(3)) ;
               ls.add(rs.getString(4)) ;;
           } 
           else{
               ls.add("you have entered wrong userid or passowrd");
           }
        }
        catch(SQLException s){
            System.out.println(s.getMessage());
        }
          
//           while(rs.next()){
//               int bid = rs.getInt(1);
//               String bname = rs.getString(2);
//               double price = rs.getDouble(3);
//               Book b = new Book(bid, bname, price);
//               BookList.add(b);
//           }
          finally{
           return ls;
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


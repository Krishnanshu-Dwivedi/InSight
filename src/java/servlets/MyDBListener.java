package servlets;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.servlet.*;
import java.sql.*;

public class MyDBListener implements ServletContextListener {
    public static Connection conn;
    
    public void contextInitialized (ServletContextEvent obj)
    {
        ServletContext ctxt = obj.getServletContext();
        
        String driver = ctxt.getInitParameter("driverName");
        String url = ctxt.getInitParameter("connUrl");
        String username= ctxt.getInitParameter("dbUser");
        String password = ctxt.getInitParameter("dbPass");
        try {
           Class.forName(driver);
            System.out.println("Driver loaded successfully............");
            conn=DriverManager.getConnection(url,username,password);
            System.out.println("Connection opened successfully................");
        } catch (Exception e)
        {
            System.out.println("Error in listener: "+e);
        }
        finally
        {
            ctxt.setAttribute("dbConn", conn);
            System.out.println("conn set in ctxt");
        }     
        
    }
        
    
   public void contextDestroyed(ServletContextEvent obj)
  {
        if(conn!=null)
        {
            try{
                conn.close();
            }
            catch(SQLException s)
            {
                System.out.println("error in listener" +s.getMessage());
            }
        }
    }
    
}
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class afterSignin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login page</title>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                margin-top:1rem;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-color: white;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            div.first{\n");
      out.write("/*                float:left;*/\n");
      out.write("                padding:2rem;\n");
      out.write("                margin-top:1rem;\n");
      out.write("                text-align: center;\n");
      out.write("                background-color:silver;\n");
      out.write("                color:white;\n");
      out.write("                margin-bottom: 1rem;\n");
      out.write("/*                height: auto;*/\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                background-color:whitesmoke;              \n");
      out.write("                margin:1rem;\n");
      out.write("                padding-top: 2 rem;\n");
      out.write("                width:50%;\n");
      out.write("                height:35%;\n");
      out.write("                margin:auto;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                border-radius: 100%;\n");
      out.write("                width:200px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .info{\n");
      out.write("                padding:1rem;\n");
      out.write("                background-color: silver;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"first\">\n");
      out.write("             \n");
      out.write("        ");

            java.util.ArrayList <String> data   =(java.util.ArrayList<String>)request.getAttribute("data");
            
            
            out.println("<img src=\" photo/user.jpg\" alt ='user photo'>");
            out.println("<h1>"+data.get(0)+" </h1>");
            out.println("</div>");
            out.println("<div class='info'>");
            out.println("<h2>Your details are following: </h2>");
            out.println("<table border='1px'>");
            out.println("<tr> <th>Your Name:</th><td>"+
                    data.get(0) + "</td></tr><tr><th>Your Userid</th><td>"+
                    data.get(1) + "</td></tr><tr><th>Your Password<td>"+
                    data.get(2) + "</td></tr><tr><th>Your Phone no.</th> <td>"+
                    data.get(3)+"</td>  </tr> <tr><th> Logout</th> <td><a href='sign-in.html'>Click here</a></td></tr>");
            out.println("</table>");
            
           
      out.write("\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

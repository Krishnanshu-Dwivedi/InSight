<%-- 
    Document   : showName
    Created on : 24 Dec, 2022, 6:52:38 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{ background-color: pink; color : white; text-align: center; padding-top: 10%}
            
        </style>
    </head>
    <body bg-color="pink">
        <%
           // java.util.ArrayList <servlets.User> data = ( java.util.ArrayList<servlets.User> ) request.getAttribute("list");
            String name = (String)request.getAttribute("username");
            
            out.println("<h1> hello "+name+" you have singed up successfully.</h1>");
            out.println("<h2>Congratulation now you can <a href='sign-in.html'> Sign-in</a>.</h2>");
            
//            for(servlets.User s : data){
//                out.println(s.toString());
//            }
            %>
      </body>
</html>

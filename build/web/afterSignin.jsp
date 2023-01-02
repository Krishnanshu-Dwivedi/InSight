<%-- 
    Document   : afterSignin
    Created on : 26 Dec, 2022, 12:45:49 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login page</title>
        <style>
            h1{
                margin-top:1rem;
            }
            body{
                background-color: white;
                text-align: left;
            }
            div.first{
/*                float:left;*/
                padding:2rem;
                margin-top:1rem;
                text-align: center;
                background-color:silver;
                color:white;
                margin-bottom: 1rem;
/*                height: auto;*/
            }
            table{
                background-color:whitesmoke;              
                margin:1rem;
                padding-top: 2 rem;
                width:60%;
                height: 100%;
                margin:auto;
                text-align: center;
                font-size: 1.5rem;
                line-height: 2.3rem;
            }
            img{
                border-radius: 100%;
                width:200px;
                
            }
            .info{
                padding:1rem;
                background-color: silver;
               
            }
            
        </style>
    </head>
    <body>
        <div class="first">
             
        <%
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
                    data.get(3)+"</td>  </tr> <tr><th> Logout</th> <td><a href='index.html' onclick='msg()'>Click here</a></td></tr>");
            out.println("</table>");
            
           %>
        </div>
        <script>
            function msg(){
                confirm("you will be logged out form your account..");
            }
            </script>
    </body>
</html>

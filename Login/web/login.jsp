<%-- 
    Document   : login
    Created on : 2023年4月24日, 下午4:54:17
    Author     : 逐星i
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <% if(request.getAttribute("errorMessage") != null){ %>
        <p style="color: red";><%= request.getAttribute("errorMessage") %></p>
        <% } %>
        
        <form method="post" action="LoginServlet">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            
            <button type="submit">Login</button>
        </form>
    </body>
</html>

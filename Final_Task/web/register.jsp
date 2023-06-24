<%-- 
    Document   : register
    Created on : 2023年5月15日, 下午4:42:58
    Author     : 逐星i
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            form{
                margin: 0 auto;
                width: 50%;
                text-align: center;
            }
            label{
                display: inline-block;
                width: 100px;
                text-align: left;
            }
            select{
                display: inline-block;
                width: 180px;
                padding: 5px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
                text-align-last: center;
            }
            .success{
                background-color: red;
                color: white;
                text-align: center;
                padding: 10px;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New User</title>
    </head>
    <body>
        <% if(request.getAttribute("message") != null){ %>
        <div class="success"><%= request.getAttribute("message") %></div>
        <% } %>
        <div style="text-align: center;">
        <h1>Add New User</h1>
        <form action="RegisterServlet" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username"><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password"><br>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email"><br>
            <label for="gender">Gender:</label>
            <select id="gender" name="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select><br>
            <label for="city">City:</label>
            <input type="text" id="city" name="city"><br>
            <input type="submit" value="Add User">
        </form>
        <br>
        <a href="index.jsp">Login Here!</a>
        </div>
    </body>
</html>

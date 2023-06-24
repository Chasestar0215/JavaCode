<%-- 
    Document   : index
    Created on : 2023年5月15日, 下午4:17:09
    Author     : 逐星i
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div style="text-align: center;">
            <h1>Login Page</h1>
            <form action="LoginServlet" method="post">
                <label for="username">User Name:</label>
                <input type="text" id="username" name="username">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password">

                <input type="submit" value="Login">
            </form>
            <a href="register.jsp">Register Here?</a>
            </div>
    </body>
</html>

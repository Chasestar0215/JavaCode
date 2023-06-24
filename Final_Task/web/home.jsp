<%-- 
    Document   : home
    Created on : 2023年5月15日, 下午5:11:34
    Author     : 逐星i
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
    Connection con = null;
    Statement stat = null;
    ResultSet rs = null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/Test", "root", "xiaojie.5212861");
        stat = con.createStatement();
        rs = stat.executeQuery("select * from User");
%>
<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Email</th>
        <th>Gender</th>
        <th>City</th>
    </tr>
    <%
        while(rs.next()){
            String id = rs.getString("id");
            String username = rs.getString("username");
            String email = rs.getString("email");
            String gender = rs.getString("gender");
            String city = rs.getString("city");
     %>
     
     <tr>
         <td><%= id %></td>
         <td><%= username %></td>
         <td><%= email %></td>
         <td><%= gender %></td>
         <td><%= city %></td>
     </tr>
     <%}%>
</table>
<%
    }catch(SQLException e){
        e.printStackTrace();
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }finally{
        try{rs.close(); }catch(Exception e) {}
        try{stat.close(); }catch(Exception e) {}
        try{con.close(); }catch(Exception e) {}
    }
%>


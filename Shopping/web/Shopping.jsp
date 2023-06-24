<%-- 
    Document   : Shopping
    Created on : 2023年4月17日, 下午4:21:26
    Author     : 逐星i
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Shopping.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Page</title>
    </head>
    <body>
        <%
            Shopping shopping = (Shopping) session.getAttribute("shopping");
            if(shopping == null){
                shopping = new Shopping();
                session.setAttribute("shopping", shopping);
            }
            
            String action = request.getParameter("action");
            if(action != null && action.equals("add")){
                String name = request.getParameter("name");
                float price = Float.parseFloat(request.getParameter("price"));
                Item item = new Item(name, price);
                shopping.addItem(item);
            }
            else if(action != null && action.equals("remove")){
                int index = Integer.parseInt(request.getParameter("index"));
                shopping.removeItem(shopping.getItems().get(index));
            }
        %>
        
        <<h1>Shopping</h1>
        
        <form method="post" action="Shopping.jsp">
            <input type="hidden" name="action" value="add">
            Name: <input type="text" name="name"><br>
            Price: <input type="text" name="price"><br>
            <input type="submit" value="Add to shopping">
        </form>
        
        <p>Items in shopping:</p>
        <ul>
            <% for(int i = 0; i < shopping.getItems().size(); i++){ %>
            <li><%= shopping.getItems().get(i) %> - <a href="shopping.jsp?action=remove&index=<%= i %>">Remove</a></li>
            <% } %>
        </ul>
        
        <p>Total: $<%= shopping.getTotal() %></p>
    </body>
</html>


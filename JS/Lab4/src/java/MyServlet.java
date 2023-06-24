/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author 逐星i
 */
public class MyServlet extends GenericServlet {
    String msg = "";
    PrintWriter out;
    public void init() throws ServletException{
        msg = "hello world, my first servlet program.";
    }
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        out = response.getWriter();
        out.println(msg);
    }
    public void destroy(){
        out.close();
    }

}

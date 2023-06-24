/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author 逐星i
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String username = request.getParameter("username");
            String password = request.getParameter("pssword");
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");
            String city = request.getParameter("city");

            Connection con = null;
            PreparedStatement stat = null;

            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "xiaojie.5212861");

                String query = "insert into User (username, password, email, gender, city) values (?, ?, ?, ?, ?)";
                stat = con.prepareStatement(query);
                stat.setString(1, username);
                stat.setString(2, password);
                stat.setString(3, email);
                stat.setString(4, gender);
                stat.setString(5, city);

                int rowsInserted = stat.executeUpdate();
                if(rowsInserted > 0){
                    HttpSession session = request.getSession();
                    session.setAttribute("username", username);
                    request.setAttribute("message", "Record successfully saved!");
                    request.getRequestDispatcher("/register.jsp").include(request, response);
                }
                else{
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("register.jsp");
                    out.println("<font color=red>Record failed!");
                    rd.include(request, response);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }finally{
                try{stat.close(); }catch(Exception e) {}
                try{con.close(); }catch(Exception e) {}
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

import java.sql.Statement;

/**
 *
 * @author Crino
 */
public class Login_Controller {
    public String message="";
    public boolean login_check(String user_name, String passcode){
        
        Login_n_search ls=new Login_n_search();
        boolean falg=ls.loginver(user_name, passcode);
        this.message=ls.message;
        return falg;
    }
}

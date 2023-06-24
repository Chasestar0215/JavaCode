/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

/**
 *
 * @author Crino
 */
public class Search_Controller {
    public String message="";
    public String Search_login(String name,String type){
        this.message=message;
        Login_n_search login_s=new Login_n_search();
        return login_s.search(name,type);
    }
}

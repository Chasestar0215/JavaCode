/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

/**
 *
 * @author Crino
 */
public class Delete_Controller {
    public String message="";
    
    public boolean delete(String name, String type){
        Delete delete=new Delete();
        boolean result=delete.delete(name, type);
        this.message=delete.message;
        return result;
    }
}

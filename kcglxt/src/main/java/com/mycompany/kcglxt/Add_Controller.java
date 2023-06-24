/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

import javax.swing.JOptionPane;

/**
 *
 * @author Crino
 */
public class Add_Controller {
    public String message="";
    
    public boolean AddUser(String user_name, String passcode, String passcode_again) {
        Record_n_update adduser = new Record_n_update();
        boolean result= adduser.adduser(user_name, passcode, passcode_again);
        this.message=adduser.message;
        return result;
    }
    public boolean addinfor(String name, String i1,String i2,String i3,String i4,String i5,String i6,String i7,String i8,String i9,String i10){
        Record_n_update adduser = new Record_n_update();
        //JOptionPane.showMessageDialog(null, i1+ i2+ i3+ i4+ i5+ i6+ i7+ i8+ i9+ i10+ name);
        boolean result=adduser.addinfor2(name, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        this.message=adduser.message;
        return result;
    }
}

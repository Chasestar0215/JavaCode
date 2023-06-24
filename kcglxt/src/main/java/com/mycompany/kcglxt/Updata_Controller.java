/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kcglxt;

import java.util.ArrayList;

/**
 *
 * @author Crino
 */
public class Updata_Controller {
    public String message="";
    public ArrayList<String> update_search(String name, String type){
        Record_n_update RNU =new Record_n_update();
        ArrayList<String> result=RNU.update_search(name, type);
        this.message=RNU.message;
        return result;
    }
    public boolean update_change(String target,String type,String name, String i1, String i2, String i3, String i4, String i5, String i6, String i7,
            String i8, String i9, String i10) {
        Record_n_update RNU =new Record_n_update();
        RNU.update(target, type, name, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        this.message=RNU.message;
        return true;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.giftapp;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
import java.io.Serializable;

public class Gift_User implements Serializable{
    private String Name;
    private String Gift;
    private String URL;
    
    public Gift_User(String Name, String Gift, String URL){
        this.Name = Name;
        this.Gift = Gift;
        this.URL = URL;
    }
    public String getName(){
        return Name;
    }
    public String getGift(){
        return Gift;
    }
    public String getURL(){
        return URL;
    }
}

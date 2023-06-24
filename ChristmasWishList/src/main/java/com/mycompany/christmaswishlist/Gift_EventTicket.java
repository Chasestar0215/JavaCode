/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.christmaswishlist;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
import java.io.Serializable;

public class Gift_EventTicket implements Serializable{
    private int Number=1;                                                               
    private String Description="Concert tickets";                                      
    private double Price=75.50;                                                              
    private String URL="www.tickets.com";                                                                 
    private String Name="Electric Picnic";
    private String Venue="Stradbally";
    
    public Gift_EventTicket(int Number, String Description, double Price, String URL, String Name, String Venue){
        this.Number = Number;
        this.Description = Description;
        this.Price = Price;
        this.URL = URL;
        this.Name = Name;
        this.Venue = Venue; 
}
    public int getNumber(){
        return Number;
    }
    public String getDescription(){
        return Description;
    }
    public double getPrice(){
        return Price;
    }
    public String getURL(){
        return URL;
    }
    public String getName(){
        return Name;
    }
    public String getVenue(){
        return Venue;
    }
}

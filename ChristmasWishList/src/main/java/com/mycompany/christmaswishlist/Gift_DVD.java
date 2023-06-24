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

public class Gift_DVD implements Serializable {
    private int Number=1;                                                               
    private String Description="Best Movie Ever!";                                     
    private double Price=17.50;                                                              
    private String URL="www.movies.com";                                                                
    private String Name="Epic Movie";
    private String Director="Speilberg";
    private String Certificate="PG";
    
    public Gift_DVD(int Number, String Description, double price, String URL, String Name, String Director, String Certificate){
        this.Number = Number;
        this.Description = Description;
        this.Price = Price;
        this.URL = URL;
        this.Name = Name;
        this.Director = Director;
        this.Certificate = Certificate;  
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
    public String getDirector(){
        return Director;
    }
    public String getCertificate(){
        return Certificate;
    }
}


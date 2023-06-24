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

public class Gift_Book implements Serializable{
    private int Number=1;                                                                                   
    private String Description="A biography of this famous persons life…";                                  
    private double Price=17.50;                                                                             
    private String URL="www.booksforsale.com";                                                                 
    private String Author="Mr. Famous Person";
    private String Title="My Biography";
    private String Isbn="978-3-16-148410-0";
    
    public Gift_Book(int Number, String Description, double Price, String URL, String Author, String Title, String Isbn){
        this.Number = Number;
        this.Description = Description;
        this.Price = Price;
        this.URL = URL;
        this.Author = Author;
        this.Title = Title;
        this.Isbn = Isbn;
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
    public String getAuthor(){
        return Author;
    }
    public String getTitle(){
        return Title;
    }
    public String getIsbn(){
        return Isbn;
    }
}

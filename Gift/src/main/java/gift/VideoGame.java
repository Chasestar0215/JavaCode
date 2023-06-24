/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

/**
 *
 * @author x21119341-Xunyu Liu
 */
import java.io.Serializable;

public class VideoGame implements Serializable{
    private int Number=1;                                                               
    private String Description="Kids 2d platform games";                                     
    private double Price=37.50;                                                              
    private String URL="www.videogames.com";
    private String Name="Super Mario";
    private String Console="Nintendo";
    private String Certificate="G";
    
    public VideoGame(int Number, String Description, double Price, String URL, String Name, String Console, String Certificate){
        this.Number = Number;
        this.Description = Description;
        this.Price = Price;
        this.URL = URL;
        this.Name = Name;
        this.Console = Console;
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
    public String getConsole(){
        return Console;
    }
    public String getCertificate(){
        return Certificate;
    }
}

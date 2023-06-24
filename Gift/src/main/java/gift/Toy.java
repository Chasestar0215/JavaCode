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

public class Toy implements Serializable{
    private int Number=1;                                                                                   
    private String Description="Kids action toy";                                  
    private double Price=17.50;                                                                             
    private String URL="www.toysforsale.com";                                                                 
    private String Name="Action Man";
    private String Type="Action Figure";
    public Toy(int Number, String Description, double Price, String URL, String Name, String Type){
        this.Number = Number;
        this.Description = Description;
        this.Price = Price;
        this.URL = URL;
        this.Name = Name;
        this.Type = Type;
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
    public String getType(){
        return Type;
    }
}

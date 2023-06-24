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
public class Voucher implements Serializable{
    private int Number=1;                                                                                   
    private String Description="Gift Voucher";                                  
    private double Price=40.00;                                                                             
    private String URL="www.powercity.com";                                                                 
    private String Store="Power City";
    private int Year=2022;
    
    public Voucher(int Number, String Description, double Price, String URL, String Store, int Year){
        this.Number = Number;
        this.Description = Description;
        this.Price = Price;
        this.URL = URL;
        this.Store = Store;
        this.Year = Year;
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
    public String getStore(){
        return Store;
    }
    public int getYear(){
        return Year;
    }
}
 

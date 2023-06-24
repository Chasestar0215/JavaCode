/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shopping;

/**
 *
 * @author 逐星i
 */
public class Item {
    private String name;
    private float price;
    
    public Item(String name, float price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public float getPrice(){
        return price;
    }
    
    public String toString(){
        return name + " - $ " + price;
    }
}

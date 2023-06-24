/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shopping;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 逐星i
 */
public class Shopping {
    private List<Item> items;
    
    public Shopping(){
        items = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public void removeItem(Item item){
        items.remove(item);
    }
    
    public float getTotal(){
        float total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
    
    public List<Item> getItems(){
        return items;
    }
}

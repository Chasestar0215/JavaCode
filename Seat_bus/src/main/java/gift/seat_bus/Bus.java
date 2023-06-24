/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift.seat_bus;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 逐星i
 */
public class Bus {
    List<Integer> available;
    String name;
    
    public Bus(List<Integer> avaiable, String name){
        this.available = avaiable;
        this.name = name;
    }
    
    public boolean bookSeats(List<Integer> seat){
        List<Integer> copy = new ArrayList<>();
        
        copy.addAll(available);
        
        copy.removeAll(seat);
        
        if(available.size() - copy.size() != seat.size()){
            return false;
        }
        available = copy;
        return true;
    }
}

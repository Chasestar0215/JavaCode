/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift.seat_bus;

import java.util.List;

/**
 *
 * @author 逐星i
 */
public class Passager implements Runnable{
    Bus bus;
    List<Integer> seat;
    
    public Passager(Bus bus, List<Integer> seat){
        this.bus = bus;
        this.seat = seat;
    }
    
    @Override
    public void run(){
        synchronized(bus){
            boolean flag = bus.bookSeats(seat);
            if(flag){
                System.out.println(Thread.currentThread().getName()+"book the"+seat);
            }
            else{
                System.out.println(Thread.currentThread().getName()+"can not book the"+seat);
            }
            System.out.println(bus.available);
        }
    }
}

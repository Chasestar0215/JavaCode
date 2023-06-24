/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bookingapp;

/**
 *
 * @author 21119210-Zhongjie Xie
 */
public class BookingApp {
    public static void main(String[] args){
        BookingInformation A= new BookingInformation("Jack","Hotel", 11, 2);
        BookingInformation a= new Hotel("Jack","Hotel", 11, 2, 211, "Yes", 280);
        System.out.println("————Booking Information————");
        System.out.println(A);
        
        BookingInformation B= new BookingInformation("Tom","Cattage",24,4);
        BookingInformation b= new Cattage("Tom","Cattage",24,4,"Shanghai Street","A",290);
        System.out.println("\n");
        System.out.println(B);
        
        System.out.println("————Hotel Information————");
        System.out.println(a);
        System.out.println("————Cattage Information————");
        System.out.println(b);
    }
}

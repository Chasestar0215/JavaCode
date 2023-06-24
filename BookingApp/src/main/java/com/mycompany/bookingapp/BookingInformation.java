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
public class BookingInformation {
    public String clientName;
    public String bookingReference;
    public int startDate;
    public int Duration;
    public BookingInformation(String clientName, String bookingReference, int startDate, int Duration){
        this.clientName= clientName;
        this.bookingReference= bookingReference;
        this.startDate= startDate;
        this.Duration= Duration;
    }
    public String toString() {
        return "clientName:"+clientName+"\nbookingReference:"+bookingReference+"\nstartDate:"+startDate+"\nDuration:"+Duration;
    }
}

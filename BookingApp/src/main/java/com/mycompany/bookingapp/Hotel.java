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
public class Hotel extends BookingInformation {
    private int roomNumber;
    private String breakfast;
    private int HotelTotal;
    public Hotel(String clientName, String bookingReference, int startDate, int Duration, int roomNumber, String breakfast, int HotelTotal){
        super(clientName, bookingReference, startDate, Duration);
        this.roomNumber= roomNumber;
        this.breakfast= breakfast;
        this.HotelTotal= HotelTotal;
    }
    public String toString() {
        return "clientName:"+clientName+"\nbookingReference:"+bookingReference+"\nstartDate:"+startDate+"\nDuration:"+Duration+"\nroomNumber:"+roomNumber+"\nbreakfast:"+breakfast+"\nNeed cost:"+HotelTotal;
    }
}

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
public class Cattage extends BookingInformation {
    private String address;
    private String keyCollectionPoint;
    private int CattageTotal;
    public Cattage(String clientName, String bookingReference, int startDate, int Duration, String address, String keyCollectionPoint, int CattageTotal){
        super(clientName, bookingReference, startDate, Duration);
        this.address= address;
        this.keyCollectionPoint= keyCollectionPoint;
        this.CattageTotal= CattageTotal;
    }
    public String toString(){
        return "clientName:"+clientName+"\nbookingReference:"+bookingReference+"\nstartDate:"+startDate+"\nDuration:"+Duration+"\naddress:"+address+"\nkeyCollectionPoint:"+keyCollectionPoint+"\nNeed cost:"+CattageTotal;
    }
}

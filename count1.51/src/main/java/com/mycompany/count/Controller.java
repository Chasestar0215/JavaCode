/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.count;

/**
 *
 * @author Crino
 */
public class Controller {
    Date dates = new Date();
    Calculator calculator = new Calculator();

    public int put(String date) {
        // get the input from the UI, input to the date object
        dates.addDate(date);
        return 0;
    }

    public String show() {
        // read the date object, output to the UI
        return dates.show();
    }

    public int clear() {
        dates.clear();
        return 0;
    }

    public int delete() {
        dates.delete();
        return 0;
    }
    public int count(){
        dates.count();
        return 0;
    }
    public int mc(){
        dates.mc();
        return 0;
    }
    public String mr(){
        return dates.mr();
    }
    public int mm(){
        dates.mm();
        return 0;
    }
    public int mp(){
        dates.mp();
        return 0;
    }
}

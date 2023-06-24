/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.count;

import java.util.Vector;

/**
 *
 * @author Crino
 */
public class Date {
    Vector<String> dates = new Vector<String>();
    String member="";
    public int addDate(String date) {
        // add date to vector
        dates.add(date);
        return 0;
    }
    
    public int show1(){
        for(String i : dates){
            System.out.println(i);
        }
        return 0;
    }
    
    public String show() {
        // show the vector
        String result = "";
        for (String date : dates) {
            result += date;
        }
        return result;
    }

    public int clear() {
        dates.clear();
        return 0;
    }

    public int delete() {
        dates.remove(dates.size() - 1);
        return 0;
    }

    private boolean isnumber(int i) {
        //System.out.println(i);
        if(i<0||i>=dates.size()){
            //System.out.print(i+"error false\n");
            return false;
        }
        
        if (dates.get(i).matches("^[0-9|.]*")||dates.get(i).equals("")) {
            //System.out.print(i+"ture\n");
            return true;
        } else {
            //System.out.print(i+"false\n");
            return false;
        }
    }

    private String read_front(int i) {
        String f_num = "";
        for (; i>=0;) {
            i--;
            //System.out.print(i);
            if(isnumber(i)){
                f_num = dates.get(i) + f_num;
                //System.out.println("read_f:"+dates.get(i)+" i:"+i);
                dates.set(i, "");
            }
            else{
                break;
            }
        }
        //System.out.println("fnum: "+f_num);
        return f_num;
    }

    private String read_back(int i) {
        String b_num = "";
        for (; i<dates.size();) {
            i++;
            if(isnumber(i)){
                b_num += dates.get(i);
                //System.out.println("read_b:"+dates.get(i)+" i:"+i);
                dates.set(i, "");
            }
            else{
                break;
            }
        }
        return b_num;
    }

    private String read_end(){
        //读取最后一个数字
        String end_num = "";
        for(int i=dates.size()-1; i>=0; --i){
            if(isnumber(i)){
                end_num = dates.get(i) + end_num;
                //这里给member用,不清理
            }
        }
        return end_num;
    }

    public int count() {
        Calculator calculator = new Calculator();
        //first loop
        int i=0;
        for (String sign : dates) {
            
            // “^”fb, “^2”f, “^3”f, “!”f, “%”f, “sin”b, “cos”b, “tan”b, “ln”b
            if (sign.equals("^")) {
                dates.set(i, calculator.count("fb", read_front(i), read_back(i), sign));
            }
            if (sign.equals("^2") || sign.equals("^3") || sign.equals("!") || sign.equals("%")) {
                //System.out.println(sign+i);
                dates.set(i, calculator.count("f", read_front(i), "", sign));
            }
            if (sign.equals("sin") || sign.equals("cos") || sign.equals("tan") || sign.equals("ln")) {
                dates.set(i, calculator.count("b", read_back(i), "", sign));
            }
            i++;
        }
        //second loop
        i=0;
        for (String sign : dates) {
            // “*”fb, “/”fb
            if (sign.equals("*") || sign.equals("/")) {
                dates.set(i, calculator.count("fb", read_front(i), read_back(i), sign));
            }
            i++;
        }
        //third loop
        i=0;
        for (String sign : dates) {
            //“+”fb, “-”fb
            if (sign.equals("+") || sign.equals("-")) {
                dates.set(i, calculator.count("fb", read_front(i), read_back(i), sign));
            }
            i++;
        }
        return 0;
    }

    public int mc() {
        member = "";
        return 0;
    }
    public String mr() {
        return member;
    }
    //String.valueOf(Float.parseFloat(num) * Float.parseFloat(num));
    public int mm() {
        member = String.valueOf(Float.parseFloat(member)-Float.parseFloat(read_end()));
        return 0;
    }
    public int mp() {
        member = String.valueOf(Float.parseFloat(member)+Float.parseFloat(read_end()));
        return 0;
    }

}

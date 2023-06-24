/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.count;

/**
 *
 * @author Crino
 */
public class Calculator {
    public String count(String type, String num1, String num2, String sign) {
        if(type.equals("f")){
            return count_f(num1, sign);
        }
        else if(type.equals("b")){
            return count_b(num1, sign);
        }
        else if(type.equals("fb")){
            return count_fb(num1, num2, sign);
        }
        else{
            return "error";
        }
    }
    private String count_f(String num, String sign) {
        // “^2”f, “^3”f, “!”f, “%”f
        //System.out.println(num);
        if(num == null || num.length() == 0){
            num = "0";
        }
        if (sign.equals("^2")) {
            return String.valueOf(Float.parseFloat(num) * Float.parseFloat(num));
        } else if (sign.equals("^3")) {
            return String.valueOf(Float.parseFloat(num) * Float.parseFloat(num) * Float.parseFloat(num));
        } else if (sign.equals("!")) {
            float result = 1;
            for (int i = 1; i <= Float.parseFloat(num); i++) {
                result *= i;
            }
            return String.valueOf(result);
        } else if (sign.equals("%")) {
            return String.valueOf(Float.parseFloat(num) / 100);
        } else {
            return "error";
        }
    }
    private String count_b(String num, String sign) {
        //“sin”b, “cos”b, “tan”b, “ln”b
        if(num == null || num.length() == 0){
            num = "0";
        }
        if (sign.equals("sin")) {
            return String.valueOf(Math.sin(Float.parseFloat(num)));
        } else if (sign.equals("cos")) {
            return String.valueOf(Math.cos(Float.parseFloat(num)));
        } else if (sign.equals("tan")) {
            return String.valueOf(Math.tan(Float.parseFloat(num)));
        } else if (sign.equals("ln")) {
            return String.valueOf(Math.log(Float.parseFloat(num)));
        } else {
            return "error";
        }
    }
    private String count_fb(String num1, String num2, String sign) {
        // “^”fb,*”fb, “/”fb, “+”fb, “-”fb
        //判空num1 和 num2
        if(num1 == null || num1.length() == 0){
            num1 = "0";
        }
        if(num2 == null || num2.length() == 0){
            num2 = "0";
        }
        if (sign.equals("^")) {
            return String.valueOf(Math.pow(Float.parseFloat(num1), Float.parseFloat(num2)));
        } else if (sign.equals("*")) {
            return String.valueOf(Float.parseFloat(num1) * Float.parseFloat(num2));
        } else if (sign.equals("/")) {
            if(Float.parseFloat(num2)==0){
                return "error";
            }
            return String.valueOf(Float.parseFloat(num1) / Float.parseFloat(num2));
        } else if (sign.equals("+")) {
            return String.valueOf(Float.parseFloat(num1) + Float.parseFloat(num2));
        } else if (sign.equals("-")) {
            return String.valueOf(Float.parseFloat(num1) - Float.parseFloat(num2));
        } else {
            return "error";
        }
    }
}

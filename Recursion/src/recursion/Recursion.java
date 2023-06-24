/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;
/**
 *
 * @author 逐星i
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static int twotothepowerof(int x){
        if(x==0){
            return 1;
        }
        else{
            return 2*(twotothepowerof(x-1));
        }
    }
    
    public static int power(int base, int exp){
        if(exp==0){
            return 1;
        }
        else{
            return base*(power(base,exp-1));
        }
    }
    
    public static void reverse(String msg){
        if(msg.length()==1){
            System.out.print(msg);
        }
        else{
            System.out.print(msg.charAt(msg.length()-1));
            msg = msg.substring(0, msg.length()-1);
            reverse(msg);
        }
    }
    
    public static boolean isPalindrome(String inString){
        int s = 0, e = inString.length()-1;
        if(inString.length()<=1){
            return true;
        }
        else if(e > s){
            if(inString.charAt(s)!=inString.charAt(e)){
                return false;
            }
            else{
                return isPalindrome(inString.substring(s+1).substring(0, e-1));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n ,x, y;
        String i;
        String o;
        System.out.println("输入指数：");
        n = in.nextInt();
        System.out.println("2 的 "+n+" 次方等于 "+twotothepowerof(n));
        System.out.println("输入底数：");
        x = in.nextInt();
        System.out.println("输入指数：");
        y = in.nextInt();
        System.out.println(x+" 的 "+y+" 次方等于 "+power(x,y));
        System.out.println("输入字符串1：");
        i = in.next();
        reverse(i);
        System.out.println("\n输入字符串2：");
        o = in.next();
        if(isPalindrome(o)==true){
            System.out.print(o+" 是回文序列。");
        }
        else{
            System.out.print(o+" 不是回文序列。");
        }
    }
    
}

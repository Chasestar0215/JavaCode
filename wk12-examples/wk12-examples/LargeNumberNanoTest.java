/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author yalemisew
 */

public class LargeNumberNanoTest {
    
    
    //long startTime = System.nanoTime();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        
        
        int num1 = in.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = in.nextInt();

        long startTime = System.nanoTime();
        
        LargeNumberNano lnm = new LargeNumberNano();
       
        int larger = lnm.compare(num1, num2);
        
        long endTime = System.nanoTime() ;

        long elapsedTime = endTime - startTime;

        System.out.println("Larger number: " + larger);
        System.out.println("Elapsed Time: " + elapsedTime + " nano second");

    }
}

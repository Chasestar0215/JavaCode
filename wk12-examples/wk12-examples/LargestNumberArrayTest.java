/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Random;

/**
 *
 * @author yalemisew
 */

public class LargestNumberArrayTest {

    public static void main(String[] args) {

        Random random = new Random();
        //generates random numbers between 0 and 8000
        int[] numbers = random.ints(1000, 0, 8000).toArray();
        System.out.println("The size is " + numbers.length);

        long startTime = System.nanoTime();
        LargestNumberArray lnm = new LargestNumberArray();

        int largest = lnm.compare(numbers);

        long endTime = System.nanoTime();


        long elapsedTime = endTime - startTime;
     

        System.out.println("Largest number: " + largest);
        System.out.println("Elapsed Time: " + elapsedTime + " Nanosecond");

    }
}

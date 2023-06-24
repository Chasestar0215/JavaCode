/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author yalemisew
 */
public class LargestNumberArray {

    public LargestNumberArray() {
    }

    public int compare(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            //uncomment the line below to see the numbers
            //System.out.println(numbers[i]);
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

        }
        return largest;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchexample;
import java.util.Scanner;

/**
 *
 * @author cmuntean
 */
public class BinarySearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int pos;
        MyArrayList<Integer> mylist2;
        mylist2 = new MyArrayList<>();
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10;i++){
            double a=Math.random()*100;
            mylist2.add((int)a);
            mylist2.insertionSort();
        }
        System.out.println("Binary Search :");
        System.out.println("The elements are: " +mylist2.toString());
        System.out.println("Use binarySearch_nonRecursive, enter the first number you want to search: ");
        int k1 = in.nextInt();
        Integer key1 = new Integer(k1);
        pos = mylist2.binarySearch_nonRecursive(key1, 0, mylist2.size()-1);

        if (pos==-1)
            System.out.println("The number : " + key1.toString() +" is NOT found!");
        else
            System.out.println("The number : " + key1.toString() +" is found!");

        System.out.println("Use binarySearch_Recursive, enter the first number you want to search: ");
        int k2 = in.nextInt();
        Integer key2 = new Integer(k2);
        pos = mylist2.binarySearch_recursive(key2, 0, mylist2.size()-1);

        if (pos==-1)
            System.out.println("The number : " + key2.toString() +" is NOT found!");
        else
            System.out.println("The number : " + key2.toString() +" is found!");
    }


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesortexample;
import java.util.*;


/**
 *
 * @author cmuntean
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        MyArrayList<Integer> mylist;
        mylist = new MyArrayList<Integer>();

        //TAKS2: add at least 5 elements of String type in your collection
       mylist.add(133);
       mylist.add(534);
       mylist.add(275);
       mylist.add(913);
       mylist.add(671);
        //TASK3: Print the elements from the collection
        System.out.println(mylist);
        //TASK4: call the bubbleSort() method
        mylist.bubbleSort();
        System.out.println(mylist);
        //TASK5: Print again the elements. Now your colection should be sorted
        mylist.add(19234);
        mylist.add(2345);
        mylist.add(1234);
        System.out.println(mylist);
        //TASK7: shuffle the collection, call the simplebubblesort() method and check if it works correct (print the elements)
        mylist.simplebubblesort();
        System.out.println(mylist);

    }

}

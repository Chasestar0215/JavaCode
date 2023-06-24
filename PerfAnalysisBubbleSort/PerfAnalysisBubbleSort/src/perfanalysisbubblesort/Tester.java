/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perfanalysisbubblesort;

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
       MyArrayList<Integer> mylist1;
       MyArrayList<String> mylist2;
            
      mylist1 = new MyArrayList<Integer>();
      mylist2 = new MyArrayList<String>();
     
        //pupulate the collection with a large number of elements
      for(int i=0;i<10000;i++){
          double a=Math.random()*10000;
          mylist1.add((int)a);
      }

      // it is important that the algorithms to be compared are applied on exactly the same colection sets.
      // List 1 elements are duplicated into List 2
      
      //for (int i = 0; i < mylist1.size() ; i ++ )
      //{
      //     mylist2.add(i, mylist1.get(i));
      //} 
      
      //TASK 1
      // apply BubbleSort() and simpleBubbleSort() on the two collections
      // measure the execution time of the two methods
      // print out the execution time of each method for the given array size.
      
      
      long startTime1 = System.currentTimeMillis();

   //*--------------------------------------------
   // execute the sort by calling the sort method
   //*--------------------------------------------
        mylist1.bubbleSort();

   //*--------------------------------------------
   // find out the time when the sort is complete
   //*--------------------------------------------
   long endTime1 = System.currentTimeMillis();

   
   //*--------------------------------------------
   // calculate the elapsed time and print a message
   //*--------------------------------------------
   System.out.println("The bubbleSort took "  + (endTime1 - startTime1)  + " Milliseconds");
   
   
   //long startTime = System.currentTimeMillis();

   //*--------------------------------------------
   // execute the sort by calling the sort method
   //*--------------------------------------------
   //    mylist2.simpleBubbleSort();

   //*--------------------------------------------
   // find out the time when the sort is complete
   //*--------------------------------------------
   //long endTime = System.currentTimeMillis();
   //System.out.println("The SimplebubbleSort took "  + (endTime - startTime)  + " Milliseconds");
      //TASK 5
      //add code that allows you to measure the execution time of the Collections.sort() method 
      //when  applied on the same dataset/ same collection as bubble sort
   //   long startTime2 = System.currentTimeMillis();

   //*--------------------------------------------
   // execute the sort by calling the sort method
   //*--------------------------------------------
   //     Collections.sort(mylist2);

   //*--------------------------------------------
   // find out the time when the sort is complete
   //*--------------------------------------------
   //long endTime2 = System.currentTimeMillis();


   //*--------------------------------------------
   // calculate the elapsed time and print a message
   //*--------------------------------------------
   //System.out.println("The CollectionsSort took "  + (endTime2 - startTime2)  + " Milliseconds");
    }


}

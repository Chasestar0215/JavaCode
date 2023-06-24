/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demorunningtime;
import java.util.*;

/**
 *
 * @author cmuntean
 */
public class SortArray {

    /**
     * @param args the command line arguments
     */
    public static int findSmallestElement(ArrayList<Integer> num)
    {
        int smElement; 
        smElement= num.get(0);
        for(int i=0; i<num.size() ; i++)
            if(num.get(i) < smElement)
                smElement=num.get(i);
            return smElement;
     }

      public static void main(String[] args) {
        // TODO code application logic here

        //*--------------------------------------------
  // put lots of data into the collection
  // this puts all the fruits in 100 times
  //*--------------------------------------------

  ArrayList<Integer> aList = new ArrayList<Integer>();
  for (int i = 0; i < 1000000 ; i ++ )
  {
	aList.add((int)Math.random()*1000);
	//1000  5000 10000 100000 1000000
   }

   //*--------------------------------------------
   // Shuffle the collection  before sorting it
   //*--------------------------------------------
 

   //*--------------------------------------------
   // find out the time before starting the sort
   //*--------------------------------------------
   long startTime = System.currentTimeMillis();

   //*--------------------------------------------
   // execute the sort by calling the sort method
   //*--------------------------------------------
   findSmallestElement(aList);

   //*--------------------------------------------
   // find out the time when the sort is complete
   //*--------------------------------------------
   long endTime = System.currentTimeMillis();


   //*--------------------------------------------
   // calculate the elapsed time and print a message
   //*--------------------------------------------
   System.out.println("The sorting of " + aList.size() + " elements took "  + (endTime - startTime)  + " Milliseconds");

    }

}

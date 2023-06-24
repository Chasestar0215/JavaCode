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

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{
     // this is a relatively efficient bubble sort ( as bubble sorts go ). It recognises that after each
    // pass of the outer loop an additional rightmost element is in the correct position and can be ignored
    public void bubbleSort()
    {
       int i,j;
       //Comparable 
               
       ElemType elemAtJ;
       ElemType elemAtJPlus;
       for (i=0; i < size(); i++ )
       {

	  for (j=0; j < size()-1 -i ; j++ )
	  {
              elemAtJ = get(j);
              elemAtJPlus = get(j+1);


	      if (((Comparable)elemAtJ).compareTo((Comparable)elemAtJPlus) > 0)
	      {
		//swap element on postion j with element on position j+1
                  swap(j, j+1);
	      }
           }
       }
     }

     public void swap(int pos1, int pos2)
     {
         //TASK1: write your code here
        ElemType e1= get(pos1);
        ElemType e2= get(pos2);
         //Create two objects that will store the info from the two positions
         //Remove element from position 1
        remove(pos1);
          //Insert objPos2 into position 1
        this.add(pos1, e2);
          //Remove element from position 2
        remove(pos2);
          // Insert objPos1 into position 2
        this.add(pos2, e1);

    }

    
     public void simplebubblesort()
    {
         //TASK 6: write code for the simplebubblesort() method
         //The simpler bubble sort method  simply compares neighbours repeatedly
         //until there are no more swaps
        int flag = 1,j;
       //Comparable 
               
       ElemType elemAtJ;
       ElemType elemAtJPlus;
       while(flag == 1){
           if(flag == 0)  break;
           else{
               for (int i=0; i < size(); i++ )
               {

                    for (j=0; j < size()-1 -i ; j++ )
                    {
                        elemAtJ = get(j);
                        elemAtJPlus = get(j+1);

                        if (((Comparable)elemAtJ).compareTo((Comparable)elemAtJPlus) > 0)
                        {
                            //swap element on postion j with element on position j+1
                            swap(j, j+1);
                        }
                    }
                }
                flag = 0;
            }
       }
    }
}


         


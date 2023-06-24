/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksortexample;
import java.util.*;
/**
 *
 * @author cmuntean
 */

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{
     
    public void quickSort(int start, int end)
    {
        int pivot_index;
        if (start < end)
        {
            pivot_index=partition(start,end);   // select pivot and re-arrange elements in two partitions such as
                                                //all array[start … p-1] are less than pivot = array [p] and
                                                // all array[p+1 … end] are >= pivot
            quickSort (start,pivot_index-1 );  // sort first partition of the array (from start to pivot_index-1)
            quickSort (pivot_index+1, end);  //sort second partition of the array
        }
        else // do nothing, the array has one element, so it is sorted
           return;
     }



   public int partition ( int start, int end)
   {
     int up, down;
     ElemType pivot;
     pivot = get(start);                         // select first element as pivot
     up = start+1;  down = end;                //set the UP and DOWN indexes
     while (up < down) {                       // as long as UP and DOWN indexes did not pass each other
         while( up< end && ((Comparable)get(up)).compareTo((Comparable)pivot)< 0 )   // increment UP index till found first element higher than pivot
                up = up +1;
         while ( down > start && (((Comparable)get(down)).compareTo((Comparable)pivot)> 0 ||((Comparable)get(down)).compareTo((Comparable)pivot)== 0)) // decrement DOWN till found first element smaller than  pivot
                down = down - 1;
         if ( up < down)                                           // if UP and DOWN indexes did not pass each other
         {
             ElemType elem_up = get(up);            
             set(up, get(down));   //swap the two found elements
             set(down, elem_up);  
         }
    }
    set( start, get(down));                              // UP and DOWN indexes have passed each other, so swap pivot
    set( down, pivot);                                  // with the element on DOWN position

    return down;
 }
}

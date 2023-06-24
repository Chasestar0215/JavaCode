/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchexample;
import java.util.*;
/**
 *
 * @author cmuntean
 */

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{



   int binarySearch_nonRecursive (ElemType key, int start, int end)
  {
    boolean found;
    int middle = 0;
    found = false;
    while ((start <= end) && ( found==false))
    {
         middle = (start+end)/2;
         if (((Comparable)get(middle)).compareTo((Comparable)key)== 0)
             found = true;
        else if (((Comparable)get(middle)).compareTo((Comparable)key)< 0)
            start = middle +1;
        else
            end=middle-1;
    }     
     if (found == true) 
        return middle;
     else
	return -1;
  }



int binarySearch_recursive (ElemType key, int start, int end)
{
    int middle = 0;
    int result;
     middle = (start+end)/2;
     
    
      if (((Comparable)get(middle)).compareTo((Comparable)key)== 0)
      {
            result = middle;
      }
      else if (start == end) 
      {
            result = -1;
      }
     else
     {        
        if (((Comparable)get(middle)).compareTo((Comparable)key)>0)
            result = binarySearch_recursive(key, start,middle-1);
        else
            result = binarySearch_recursive(key, middle+1, end);
     } 
     
    return result;
}
public void insertionSort()
    {
       /*
        * Write the Java code for the insertionSort() method based on the pseudo code provided in the notes.
        */
        int i, pos;
        ElemType keyelement;
        for (i = 1 ;i< size(); i++)  
        { 
            keyelement = get(i); 
            pos = i;  //position of the key element
	    while (pos > 0 && ((Comparable)get(pos-1)).compareTo((Comparable)keyelement) > 0)
		{
			set(pos,get(pos-1));
			pos = pos -1;
		} //end while loop
            set(pos,keyelement); 
	
        }
    }
}

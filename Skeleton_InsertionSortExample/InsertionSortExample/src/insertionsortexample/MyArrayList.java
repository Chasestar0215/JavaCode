/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortexample;
import java.util.*;
/**
 *
 * @author cmuntean
 */
public class MyArrayList<ElemType> extends ArrayList<ElemType>
{
     
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


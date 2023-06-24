/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package linearsearchexample;
import java.util.*;
/**
 *
 * @author cmuntean
 */

public class MyArrayList<ElemType> extends ArrayList<ElemType>
{

    public int unordered_sequentialSearch(ElemType key)
    {
        int k;
        for (k =0;k <size();k++)
        {
            
	   while(((Comparable)get(k)).compareTo((Comparable)key)== 0)
           {
               
		return k;
           }
           
        }
	return -1;
     }


    public int ordered_sequentialSearch(ElemType key)
    {
        int k;
        k=0;
	while (((Comparable)get(k)).compareTo((Comparable)key)<0  &&  k < size())
        {  
            
            k = k+1;
        }
        while(((Comparable)get(k)).compareTo((Comparable)key)==0)
        {
            
            return k;
        }
        
       
            return -1;

        
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

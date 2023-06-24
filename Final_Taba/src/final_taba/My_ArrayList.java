/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_taba;
import java.util.*;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class My_ArrayList<ElemType> extends ArrayList<ElemType>
{

    public int LinearSearch(int key)
    {
        int k;
        int num = 0;
        for (k =0;k <size();k++)
        {
            num = num + 1;
	   while(((Comparable)get(k)).compareTo((Comparable)key)== 0)
           {
		return -1;
           }
           
        }
	return num;
    }
    
    
    int binarySearch(int key, int start, int end)
    {
        boolean found;
        int middle = 0;
        int num = 0;
        found = false;
        while ((start <= end) && ( found==false))
        {
            middle = (start+end)/2;
            if (((Comparable)get(middle)).compareTo((Comparable)key)== 0){
                found = true;
                num = num + 1;
            }
            else if (((Comparable)get(middle)).compareTo((Comparable)key)< 0){
                start = middle +1;
                num = num + 1;
            }
            else{
                end=middle-1;
                num = num + 1;
            }
        }
        num = num + 1;
        if (found == true) {
            return -1;
        }
        else
            return num;
    }
    
    
    public void insertionSort()
    {
        int i, position;
        ElemType key_element;
        for (i = 1 ;i< size(); i++)  
        { 
            key_element = get(i); 
            position = i;
	    while (position > 0 && ((Comparable)get(position-1)).compareTo((Comparable)key_element) > 0)
		{
                    set(position,get(position-1));
                    position = position -1;
		}
            set(position ,key_element); 
        }
    }   
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;
import java.util.*;

/**
 *
 * @author 逐星i
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={78,45,321,78,453,226,770,217};
        int[] temp = new int[array.length];
        System.out.println(Arrays.toString(array));
        mergeSort(array,0,array.length-1,temp);
        System.out.println(Arrays.toString(array));
    }
 public static void mergeSort(int[] array,int start, int end, int[] temp){
        if(start<end)
            {
                int mid;
                mid=(start+end)/2;
                mergeSort(array,start,mid,temp);
                mergeSort(array,mid+1,end,temp);
                merge(array,start,mid,end,temp);
            }
    }
    public static void merge(int array[], int left,int middle, int right,int[] temp){
        
        int i=left, j=middle, k=0;
        
        
        
        while(i<=middle && j<=right){
            if(array[i]<array[j]){
                temp[k]=array[i];
                i=i+1;
            }
            else{
                temp[k]=array[j];
                j=j+1;
            }
            k=k+1;
        }
        
        while(i<=middle){
            temp[k]=array[i];
            k=k+1;
            i=i+1;
        }
        
        while(i<=right){
            temp[k]=array[j];
            k=k+1;
            j=j+1;
        }
        for(i=left;i<=right;i++,k++){
            array[i]=temp[k];
        }
    }
    
}

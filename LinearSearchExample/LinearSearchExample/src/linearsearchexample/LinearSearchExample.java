/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearchexample;
import java.util.Scanner;
/**
 *
 * @author cmuntean
 */
public class LinearSearchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        MyArrayList<Integer> mylist;
        mylist = new MyArrayList<>();
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10;i++){
            double a=Math.random()*100;
            mylist.add((int)a);
        }
       
        System.out.println("The unordered-sequence list elements are: " +mylist.toString());
        
        
        System.out.println("In the unordered-sequence list, enter the number you want to search: ");
        int k1 = in.nextInt();
        Integer key = new Integer(k1);
        int pos1 = mylist.unordered_sequentialSearch(key);
        
        if (pos1 == -1)
              System.out.println("The number : " + key.toString() +" is NOT found!");
        else
              System.out.println("The number : " + key.toString() +" is found, on position " + pos1);
        for(int i=0; i<mylist.size();i++){
            for(int j=i+1;j<mylist.size();j++){
                if(mylist.get(i).equals(mylist.get(j))){
                    System.out.println("Have same elements "+mylist.get(i)+", on position " +i);
                    System.out.println("Have same elements "+mylist.get(j)+", on position " +j);
                }
            }
        }
  
        MyArrayList<Integer> mylist2;
        mylist2 = new MyArrayList<>();

        for(int i = 0; i < 10;i++){
            double a=Math.random()*100;
            mylist2.add((int)a);
            mylist2.insertionSort();
        }

        System.out.println("The ordered-sequence listelements are: " +mylist2.toString());
        System.out.println("In the ordered-sequence list, enter the number you want to search: ");
        int k2 = in.nextInt();
        Integer key2 = new Integer(k2);
        int pos2 = mylist2.ordered_sequentialSearch(key2);

        if (pos2 == -1)
            System.out.println("The number : " + key2.toString() +" is NOT found!");
        else
            System.out.println("The number : " + key2.toString() +" is found, on postion "+ pos2);
        for(int i=0; i<mylist2.size();i++){
            for(int j=i+1;j<mylist2.size();j++){
                if(mylist2.get(i).equals(mylist2.get(j))){
                    System.out.println("Have same elements "+mylist2.get(i)+", on position " +i);
                    System.out.println("Have same elements "+mylist2.get(j)+", on position " +j);
                }
            }
        }

    }


}
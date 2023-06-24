/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsortexample;

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
        
        mylist1 = new MyArrayList<Integer>();
        
        for(int i=0;i<10000;i++){
          double a=Math.random()*10000;
          mylist1.add((int)a);
      }

        long startTime1 = System.currentTimeMillis();
        mylist1.insertionSort();
        long endTime1 = System.currentTimeMillis();
        
        System.out.println("The insertionSort took "  + (endTime1 - startTime1)  + " Milliseconds");
    }
}

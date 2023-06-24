/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksortexample;

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
        MyArrayList<Integer> mylist;
        mylist = new MyArrayList<Integer>();

        mylist.add(new Integer(99));
        mylist.add(new Integer(6));
        mylist.add(new Integer(86));
        mylist.add(new Integer(15));
        mylist.add(new Integer(58));
        mylist.add(new Integer(35));
        mylist.add(new Integer(87));
        mylist.add(new Integer(0));
        mylist.add(new Integer(4));
       
        System.out.println("The elements are: " +mylist.toString());

        mylist.quickSort(0,mylist.size()-1);

        System.out.println("The elements after Quick sort are: " +mylist.toString());

    }


}

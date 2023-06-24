/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_taba;

import javax.swing.JOptionPane;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class Final_Taba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create three arrays.
        My_ArrayList<Integer> mylist1 = new My_ArrayList<>();
        My_ArrayList<Integer> mylist2 = new My_ArrayList<>();
        My_ArrayList<Integer> mylist3 = new My_ArrayList<>();
        
        //Define list1 has ten elements
        for(int i = 0; i < 10;i++){
            double a = Math.random()*100;
            mylist1.add((int)a);
        }
        
        //Define list2 has fifty elements
        for(int i = 0; i < 50;i++){
            double a = Math.random()*200;
            mylist2.add((int)a);
        }
        
        //DEfine list3 has hundred elements
        for(int i = 0; i < 100;i++){
            double a = Math.random()*500;
            mylist3.add((int)a);
        }
        
        
        
        //List1 operation:
        JOptionPane.showMessageDialog(null,"The list1 elements are: " +mylist1.toString()+" .","Enter",JOptionPane.INFORMATION_MESSAGE);
        int k1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number you want to search:"));
        Integer mykey1 = new Integer(k1);
        
        int num1 = mylist1.LinearSearch(mykey1);
        if (num1!=-1){
            JOptionPane.showMessageDialog(null,"The number : " + mykey1.toString() +" is NOT found!","Error!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Use the Linear_search the specific number of lookups are: "+num1);
        }
        else
            JOptionPane.showMessageDialog(null,"The number : " + mykey1.toString() +" is found!","Find success!",JOptionPane.PLAIN_MESSAGE);
        
        //Binary search, need to sort.
        mylist1.insertionSort();
        num1 = mylist1.binarySearch(mykey1, 0, mylist1.size()-1);
        if (num1!=-1){
            JOptionPane.showMessageDialog(null,"The number: " + mykey1.toString() +" is NOT found!","Error!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Use the Binary_search the specific number of lookups are: "+num1);
        }
        else
            JOptionPane.showMessageDialog(null,"The number : " + mykey1.toString() +" is found!","Find success!",JOptionPane.PLAIN_MESSAGE);
        
        
        
        //List2 operation:
        JOptionPane.showMessageDialog(null,"The list2 elements are: " +mylist2.toString()+" .","Enter",JOptionPane.INFORMATION_MESSAGE);
        int k2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number you want to search:"));
        Integer mykey2 = new Integer(k2);
        
        int num2 = mylist2.LinearSearch(mykey2);
        if (num2!=-1){
            JOptionPane.showMessageDialog(null,"The number : " + mykey2.toString() +" is NOT found!","Error!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Use the Linear_search the specific number of lookups are: "+num2);
        }
        else
            JOptionPane.showMessageDialog(null,"The number : " + mykey2.toString() +" is found!","Find success!",JOptionPane.PLAIN_MESSAGE);
        
        //Binary search, need to sort.
        mylist2.insertionSort();
        num2 = mylist2.binarySearch(mykey2, 0, mylist2.size()-1);
        if (num2!=-1){
            JOptionPane.showMessageDialog(null,"The number: " + mykey2.toString() +" is NOT found!","Error!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Use the Binary_search the specific number of lookups are: "+num2);
        }
        else
            JOptionPane.showMessageDialog(null,"The number : " + mykey2.toString() +" is found!","Find success!",JOptionPane.PLAIN_MESSAGE);
        
        
        
        //List3 operation:
        JOptionPane.showMessageDialog(null,"The list3 elements are: " +mylist3.toString()+" .","Enter",JOptionPane.INFORMATION_MESSAGE);
        int k3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number you want to search:"));
        Integer mykey3 = new Integer(k3);
        
        int num3 = mylist3.LinearSearch(mykey3);
        if (num3!=-1){
            JOptionPane.showMessageDialog(null,"The number : " + mykey3.toString() +" is NOT found!","Error!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Use the Linear_search the specific number of lookups are: "+num3);
        }
        else
            JOptionPane.showMessageDialog(null,"The number : " + mykey3.toString() +" is found!","Find success!",JOptionPane.PLAIN_MESSAGE);
        
        //Binary search, need to sort.
        mylist3.insertionSort();
        num3 = mylist3.binarySearch(mykey3, 0, mylist3.size()-1);
        if (num3!=-1){
            JOptionPane.showMessageDialog(null,"The number: " + mykey3.toString() +" is NOT found!","Error!",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"Use the Binary_search the specific number of lookups are: "+num3);
        }
        else
            JOptionPane.showMessageDialog(null,"The number : " + mykey3.toString() +" is found!","Find success!",JOptionPane.PLAIN_MESSAGE);
    }

}

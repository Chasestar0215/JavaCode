/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlistapp;

/**
 *
 * @author 逐星i
 */
public class SingleLinkedListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLList List = new SLList();
        List.add(1,"first");
        List.add(2,"second");
        List.add(3,"third");
        List.add(4,"forth");
        if(List.isEmpty()){
            System.out.println("null");
        }
        else{
            System.out.println("Not empty. This List are: "+List.size());
            List.printList();
        }
        List.add("fifth");
        List.remove(1);
        System.out.println("The 1st element was remove.");
        List.printList();
        System.out.print("The 3rd element is: "+ List.get(3) +"\n");
    }
}

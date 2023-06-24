/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp;
import java.util.*;

/**
 *
 * @author nchu
 */
public class myStack implements stackInterface{
        private ArrayList<String> theStack;

    /** Creates a new instance of Stack */
    public myStack()
    {
        theStack = new ArrayList<String>();
    }

    public boolean isEmpty()
    {
        return theStack.isEmpty();
    }
   
    /** always false as there is no limit on the size of this ArrayList based stack */
    public boolean isFull()
    {
        return false;
    }

    /** removes the item  from the TOP (first position) of the stack and returns it */
    public Object pop()
    {
        if (!(theStack.isEmpty()))
        {
             return theStack.remove(0);
        }
        else
		return null;
    }


    /** puts/inserts an item onto the TOP (first position) of the stack */
    public void push(Object newItem)
    {
          theStack.add(0, (String)newItem);

    }
    
    public int size(){
        return theStack.size();
    }
    
    public String Display(int i){
        return theStack.get(i);
    }

}

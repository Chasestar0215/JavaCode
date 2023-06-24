/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine_app;

import java.util.*;
/**
 *
 * @author x21119210-Zhongjie Xie
 */
public class MyQueue implements PQinterface{
    private ArrayList<PQElement> thePQueue;
    
    public MyQueue() {
        thePQueue = new ArrayList<PQElement>();    
    } 
    
    public boolean isEmpty() { 
        return thePQueue.isEmpty(); 
    }
  
    public int size(){
	  return thePQueue.size();
    }

    private int findInsertPosition(int newkey)
      {
          boolean found;
          PQElement elem;
          int position;
          found = false;
          
          for ( position = 0; position<thePQueue.size(); position++)
          {
            elem = thePQueue.get(position);
            if(elem.getKey()< newkey)  
            {
                break;
            }
          }

         return position;
        }
    

    public void enqueue(int age, String statment, String name)
    {
        int index;
        int key;
        if(age >= 70)
            key = 6;
        else if(age >= 65 && age < 70)
            key = 5;
        else if(age >=18 && age< 65 && statment.equals("yes"))
            key = 4;
        else if(age >= 36 && age <65)
            key = 3;
        else if(age >= 16 && age <36)
            key = 2;
        else 
            key = 1;
        
        PQElement elem = new PQElement(age,statment,name,key);
        
        index = findInsertPosition(key);

        if (index > size())
            thePQueue.add(elem);
        else
            thePQueue.add(index, elem);
    }

    public Object dequeue()
    {
        return thePQueue.remove(0);
    }
    
    
    public String printPQueue()
    {
        PQElement elem;
        String printStr = new String();
        for (int i = 0; i<thePQueue.size();i++)
        {
            elem = thePQueue.get(i);
            printStr = printStr.concat("Name: "+elem.getName()+"    Age: "+elem.getAge()+"     The medical condition: "+elem.getStatment()+ "    The priority: "+elem.getKey()+".\n");

        }
         return printStr;
    }
    
    public String printName()
    {
        PQElement elem;
        String printStr = new String();
        for (int i = 0; i<thePQueue.size();i++)
        {
            elem = thePQueue.get(i);
            printStr = printStr.concat(elem.getName()+" was registered. Delete successful.\n");

        }
         return printStr;
    }
}

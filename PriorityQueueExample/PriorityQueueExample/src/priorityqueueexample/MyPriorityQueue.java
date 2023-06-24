/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueueexample;

import java.util.*;

/**
 *
 * @author eugene
 */
public class MyPriorityQueue implements PQInterface
{
    private ArrayList<PQElement> thePQueue;
    
    public MyPriorityQueue() {
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
         // position =0;
          
          for ( position = 0; position<thePQueue.size(); position++)
          {
            elem = thePQueue.get(position);
            if(elem.getKey()< newkey)  
            {
                break;
            }
          }
              
              
          /* while (position<thePQueue.size() && !found)
          {
            elem = thePQueue.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else
            {
                found = true;
            }
          }
*/
         return position;
        }
    
    // new element with a given key and object info will be added 
    public void enqueue(int age, String condition,String name, int priorkey)
    {
        int index;
        PQElement elem = new PQElement(age,condition,name,priorkey);
        
        index = findInsertPosition(priorkey);

        if (index > size())
            thePQueue.add(elem);
        else
            thePQueue.add(index, elem);
    }



    //the first element has the highest priority
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
            printStr = printStr.concat("Name: "+elem.getName()+"Key = "+elem.getKey()+" Condition= "+elem.getCondition()+"\n");
            
        }
         return printStr;
    }

}









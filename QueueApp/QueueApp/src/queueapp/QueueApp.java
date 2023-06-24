/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

/**
 *
 * @author cmuntean
 */
public class QueueApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //TO DO TASKS
        /* Add at least 3 strings to the queue,
            Check the size of the queue,
            Add another 7 strings to the queue
            Dequeue some strings and print them.
            Check again the size of the queue
            Print the element at the front of the queue
            Test dequeueing from an empty queue.
         *
         */
        
        QueueInterface q = new MyQueue();
        // enqueue 3 items (String type)into the queue   
        q.enqueue("Element 1");
        q.enqueue("Element 2");
        q.enqueue("Element 3");
        System.out.println("Added three elements");
        
        // check the size of queue
        System.out.println("size is " + q.size());
        
         // enqueue 7 extra items (String type)into the queue   
        q.enqueue("Element 4");
        q.enqueue("Element 5");
        q.enqueue("Element 6");
        q.enqueue("Element 7");
        q.enqueue("Element 8");
        q.enqueue("Element 9");
        q.enqueue("Element 10");
        System.out.println("Added seven more elements");
        
         // check the size of queue again
        System.out.println("size is " + q.size());

        //print the item at the front of  the queue
        System.out.println(q.frontElement() + " is at the Front");

        //remove/dequeue all items from the queue
        while (q.size() > 0) {
           System.out.println("dequeued: " + q.dequeue());
           System.out.println("size is: " + q.size());
        }
       // Try to dequeue/remove from an empty queue
       System.out.println("dequeued: " + q.dequeue());
    }

}

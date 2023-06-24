/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package priorityqueueexample;

/**
 *
 * @author eugene
 */
public interface PQInterface {
    public void enqueue(int age, String condition, String name, int priorkey);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    
    public String printPQueue();

}

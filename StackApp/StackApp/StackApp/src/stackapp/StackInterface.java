/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

/**
 *
 * @author cmuntean
 */
public interface StackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object newItem);
    public Object pop();
   
}

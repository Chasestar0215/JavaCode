/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine_app;

/**
 *
 * @author x21119210-Zhongjie Xie
 */
public interface PQinterface {
    public void enqueue(int age, String statment, String name);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printName();
    public String printPQueue();
}

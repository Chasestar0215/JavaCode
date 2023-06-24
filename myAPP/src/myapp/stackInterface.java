/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package myapp;

/**
 *
 * @author nchu
 */
public interface stackInterface {
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object newItem);
    public Object pop();
    public int size();
    public String Display(int i);
}

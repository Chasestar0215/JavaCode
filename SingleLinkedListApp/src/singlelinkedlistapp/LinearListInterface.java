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
public interface LinearListInterface {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void remove(int index);
    public void add(int index, Object theElement);
    public void add(Object element);
    public void printList();
}

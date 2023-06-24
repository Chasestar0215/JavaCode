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
public class Node {
    private Object element;
    private Node next;

    public Node(Object e, Node n){
	element = e;
	next = n;
    }

    public Node getNext() {
	return next;
    }

    public void setNext(Node n) {
	next = n;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object e) {
	element = e;
    }

    public String toString() {
        return element.toString();
    }
}

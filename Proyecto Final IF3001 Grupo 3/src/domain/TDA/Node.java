/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.TDA;

import domain.*;

/**
 *
 * @author Maria Celeste
 */
public class Node {
     public Object data;
    public Node next; //apuntador al sgte node
    public Node prev; //apuntador al nodo anterior
    
    //Constructor
    public Node(Object data){
        this.data = data;
        this.prev = this.next = null;
    }

    public Node() {
        this.next = null;
    }
    
 

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}

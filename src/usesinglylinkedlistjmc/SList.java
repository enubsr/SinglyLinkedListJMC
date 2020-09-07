/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usesinglylinkedlistjmc;

/**
 *
 * @author Enubs
 * @param <E>
 */
public class SList<E> {
    private SNode<E> head, tail;
    private int size;
    
    public SList(){
        head = null;
        tail = null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first(){
        return head.getElement();
    }
    
    public E last(){
        return tail.getElement();
    }
    
    public void addFirst(E element){
        SNode<E> newNode = new SNode<>(element, null);
        if(size == 0){
            tail = newNode;
        }
        
        newNode.setNext(head);
        head = newNode;
        size++;
    }
    
    public void addLast(E element){
        SNode<E> newNode = new SNode<>(element, null);
        if(size == 0){
            head = newNode;
            
        }
        
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }
    
    public E removeFirst(){
        SNode<E> temp = head;
        head = temp.getNext();
        temp.setNext(null);
        size--;
        return temp.getElement();
    }
    
    public void displayList(){
//        System.out.print("[" + head.getElement() + "]");
//        System.out.print("[" + head.getNext().getElement() + "]");
//        System.out.print("[" + head.getNext().getNext().getElement() + "]");
//        System.out.print("[" + head.getNext().getNext().getNext().getElement() + "]");

        SNode<E> temp = head;
        
        for(int count = 0; count < size(); count++){
            System.out.print("[" + temp.getElement() + "]");
            temp = temp.getNext();
        }
    }
}

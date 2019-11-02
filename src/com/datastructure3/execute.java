
package com.datastructure3;

public class execute {
    
    public static void main(String[] args) {
        
        DoublyLinkedList mylist = new DoublyLinkedList();
        
        mylist.addFirts("element1");
        mylist.addFirts("element2");
        mylist.addFirts("element3");
        int index = mylist.indexOf("element2");
        System.out.println(index);
        System.out.println(mylist.peekFirst());
        System.out.println(mylist.peekLast());
        
    }
}

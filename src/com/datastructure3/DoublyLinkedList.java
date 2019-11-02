
package com.datastructure3;

public class DoublyLinkedList {
    
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    private class Node {
        String data;
        Node prev, next;
        
        public Node(String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
    
    //Methods clear Empty this linked list O(n)
    public void clear() {
        Node trav = head;
        while(trav != null) {
            Node next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }
        
        head = tail = trav = null;
        size = 0;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    public void addFirts(String element) {
        if(isEmpty()) {
            head = tail = new Node(element, null, null);
        } else {
            head.prev = new Node(element, null, head);
            head = head.prev;
        }
        
        size++;
    }
    
    public void addLast(String element) {
        if(isEmpty()) {
            head = tail = new Node(element, null, null);
        } else {
            tail.next = new Node(element, tail, null);
            tail = tail.next;
        }
        size++;
    }
    
    // Return first element
    public String peekFirst() {
        if(isEmpty()) throw new RuntimeException("Empty List");
        return head.data;
    }
    
    //Return last element
    public String peekLast() {
        if(isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }
    
    //Remove first Node O(1)
    public String removeFirst() {
        if(isEmpty()) throw new RuntimeException("Empty List");
        
        String data = head.data;
        head = head.next;
        --size;

        if(isEmpty()) tail = null;
        else head.prev = null;
        
        return data;
    }
    
    //Remove last Node O(1)
    public String removeLast() {
        if(isEmpty()) throw new RuntimeException("Empty List");
        
        String data = tail.data;
        tail = tail.prev;
        --size;

        if(isEmpty()) tail = head = null;
        else tail.next = null;
        
        return data;
    }
    
    //Remove Node
    private String remove(Node node) {
        
        if(node.prev == null) return removeFirst();
        if(node.next == null) return removeLast();
        
        node.next.prev = node.prev;
        node.prev.next = node.next;
        
        String data = node.data;
        
        node.data = null;
        node = node.prev = node.next = null;
        
        --size;
        
        return data;
        
    }
    
    public String removeAt(int index) {
        
        if (index < 0 || index >= size) throw new IllegalArgumentException();
        
        int i;
        Node trav;
        
        if (index < size/2) {
            for(i=0, trav = head; i != index; i++) {
                trav = trav.next;
            }
        } else {
            for(i = size-1, trav = tail; i != index; i--) {
                trav = trav.prev;
            }
        }
        
        return remove(trav);
    }
    
    public boolean remove(Object obj) {
        
        Node trav = head;
        
        if(obj == null) {
            for(trav = head; trav != null; trav = trav.next) {
                if(trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
        } else {
            for(trav = head; trav != null; trav = trav.next) {
                if (obj.equals(trav.data)) {
                    remove(trav);
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public int indexOf(Object obj) {
        
        int index = 0;
        Node trav = head;
        
        if (obj == null) {
            for (trav = head; trav != null; trav = trav.next, index++) {
                if (trav.data == null) {
                    return index;
                }
            }
        } else {
            for (trav = head; trav != null; trav = trav.next, index++) {
                if (obj.equals(trav.data)) {
                    return index;
                }
            }
        }
        
        return -1;
    }
    
    public  boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }
    
    
}

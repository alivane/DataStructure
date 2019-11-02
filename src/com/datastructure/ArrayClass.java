
package com.datastructure;

// Clase 1: Array Basic

public class ArrayClass {
    
    String[] names = new String[10];
    
    public void insert() {
   
        names[0] = "Jack";
        names[1] = "Ali";
        names[2] = "Rahul";
   
    }
    
    public void displayNames() {
        
        for(String name : names) {
            System.out.println( name );
        }
        
    }
    
    
    public static void main(String[] args) {
        
        ArrayClass arrclass = new ArrayClass();
        
        arrclass.insert();
        arrclass.displayNames();
        
    }
    
    
}

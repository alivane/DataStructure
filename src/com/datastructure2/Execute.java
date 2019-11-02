
package com.datastructure2;

public class Execute {
    
    public static void main(String[] args) {
        
        MyListClass list = new MyListClass();
        
        list.add("Jack");
        list.add("Matias");
        list.add("Carla");
        list.add("Jack");
        list.add("Matias");
        list.add("Carla");
        list.add("Jack");
        list.add("Matias");
        list.add("Carla");
        list.add("Jack");
        list.add("Matias");
        list.add("Carla");
        
        list.getElements();
        list.remove("Carla");
        System.out.println("\n");
        list.getElements();
        
    }
    
}

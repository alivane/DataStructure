
package com.datastructure2;

public class MyListClass {

    String[] list = null;
    int pointer = -1;
    
    public MyListClass() {
        list = new String[10];
    }
    
    public MyListClass(int size) {
        list = new String[size];
    }
    
    //Method
    
    public void add(String element) {
        
        ++pointer;
        
        if(pointer >= list.length) {
            String[] newList = new String[list.length + 20];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        
        list[pointer] = element;
        
    }
    
    public void remove(String element) {
        if(containElement(element)) {
            int index = index(element);
            int positionOne = index;
            int positionTwo = index + 1;
            
            for(int i=index; i<list.length; i++){
                if(positionTwo < list.length) {
                    list[positionOne] = list[positionTwo];
                    positionOne++;
                    positionTwo++;
                }
            }
            pointer--;
        }
    }
    
    
    public void getElements() {
        
        for(int i=0; i<= size(); i++) {
            System.out.println( list[i]);
        }
    }
    
    
    public String getElement(int index) {
        return list[index];
    }
    
    
    public int size(){
        return pointer;
    }
    
    
    public boolean containElement(String element) {
        if(pointer >= 0){
            for(int i=0; i<list.length; i++) {
                if(list[i].equalsIgnoreCase(element)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public int index(String element) {
        for(int i=0; i<list.length; i++) {
            if(list[i].equalsIgnoreCase(element)) {
                return i;
            }
        }
        return -1;
    }
}

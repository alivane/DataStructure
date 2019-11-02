/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alisson
 */
public class DoublyLinkedListTest {
    
    public DoublyLinkedListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of clear method, of class DoublyLinkedList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.clear();
    }

    /**
     * Test of size method, of class DoublyLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = 1;
        instance.addFirts("Element");
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class DoublyLinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        DoublyLinkedList instance = new DoublyLinkedList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        
        instance.addFirts("Element 1");
        boolean expResultTwo = false;
        boolean resultTwo = instance.isEmpty();
        assertEquals(expResultTwo, resultTwo);
    }

    /**
     * Test of addFirts method, of class DoublyLinkedList.
     */
    @Test
    public void testAddFirts() {
        System.out.println("addFirts");
        String element = "Element 1";
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirts(element);
        int expResult = 1;
        int sizeResult = instance.size();
        assertEquals(expResult, sizeResult);
    }

    /**
     * Test of addLast method, of class DoublyLinkedList.
     */
    @Test
    public void testAddLast() {
        System.out.println("addLast");
        String elementOne = "Element 1";
        String elementTwo = "Element 2";
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirts(elementOne);
        instance.addLast(elementTwo);
        String peekLast = instance.peekLast();
        assertEquals(elementTwo, peekLast);
    }

    /**
     * Test of peekFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testPeekFirst() {
        System.out.println("peekFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        String element = "Element 1";
        instance.addFirts(element);
        String expResult = "Element 1";
        String result = instance.peekFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of peekLast method, of class DoublyLinkedList.
     */
    @Test
    public void testPeekLast() {
        System.out.println("peekLast");
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addLast("Element 1");
        instance.addLast("Element 2");
        instance.addLast("Element 3");
        String expResult = "Element 3";
        String result = instance.peekLast();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeFirst method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
        System.out.println("removeFirst");
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirts("Element");
        instance.addFirts("Element 1");
        String expResult = "Element 1";
        String result = instance.removeFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeLast method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveLast() {
        System.out.println("removeLast");
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirts("Element");
        instance.addFirts("Element 1");
        String expResult = "Element";
        String result = instance.removeLast();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeAt method, of class DoublyLinkedList.
     */
    @Test
    public void testRemoveAt() {
        System.out.println("removeAt");
        int index = 1;
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirts("Element");
        instance.addFirts("Element 1");
        instance.addFirts("Element 2");
        String expResult = "Element 1";
        String result = instance.removeAt(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class DoublyLinkedList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object obj = "Element";
        DoublyLinkedList instance = new DoublyLinkedList();
        instance.addFirts("Element");
        boolean expResult = true;
        boolean result = instance.remove(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of indexOf method, of class DoublyLinkedList.
     */
    @Test
    public void testIndexOf() {
        System.out.println("indexOf");
        Object obj = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        int expResult = -1;
        int result = instance.indexOf(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class DoublyLinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Object obj = null;
        DoublyLinkedList instance = new DoublyLinkedList();
        boolean expResult = false;
        boolean result = instance.contains(obj);
        assertEquals(expResult, result);
    }
    
}

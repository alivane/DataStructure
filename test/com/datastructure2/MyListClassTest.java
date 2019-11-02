/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure2;

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
public class MyListClassTest {
    
    public MyListClassTest() {
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
     * Test of add method, of class MyListClass.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        
        String element = "element 1";
        MyListClass instance = new MyListClass();
        instance.add(element);
        assertEquals(0, instance.size());
    }

    /**
     * Test of remove method, of class MyListClass.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String element = "element 1";
        MyListClass instance = new MyListClass();
        instance.add(element);
        instance.remove(element);
        assertEquals(-1, instance.size());
    }

    /**
     * Test of getElements method, of class MyListClass.
     */
    @Test
    public void testGetElements() {
        System.out.println("getElements");
        MyListClass instance = new MyListClass();
        instance.getElements();
    }

    /**
     * Test of getElement method, of class MyListClass.
     */
    @Test
    public void testGetElement() {
        System.out.println("getElement");
        int index = 0;
        MyListClass instance = new MyListClass();
        String expResult = "123";
        instance.add(expResult);
        String result = instance.getElement(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class MyListClass.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        MyListClass instance = new MyListClass();
        int expResult = -1;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of containElement method, of class MyListClass.
     */
    @Test
    public void testContainElement() {
        System.out.println("containElement");
        String element = "element";
        MyListClass instance = new MyListClass();
        boolean expResult = false;
        boolean result = instance.containElement(element);
        assertEquals(expResult, result);
    }

    /**
     * Test of index method, of class MyListClass.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        String element = "element";
        MyListClass instance = new MyListClass();
        instance.add(element);
        int expResult = 0;
        int result = instance.index(element);
        assertEquals(expResult, result);
    }
    
}

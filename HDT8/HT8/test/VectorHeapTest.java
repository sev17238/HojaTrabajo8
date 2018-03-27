/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Paul Belches 17088 - Diego Sevilla 17238
 * @Date 25/03/18
 */
public class VectorHeapTest {
    
    /**
     * Test of clear method, of class VectorHeap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        instance.add("b");
        instance.add("c");
        instance.clear();
        assertEquals(instance.data,null);
    }

    /**
     * Test of parent method, of class VectorHeap.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        instance.add("b");
        instance.add("c");
        int result = VectorHeap.parent(2);
        assertEquals(0, result);
    }

    /**
     * Test of left method, of class VectorHeap.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        instance.add("b");
        instance.add("c");
        int result = VectorHeap.left(0);
        assertEquals(1, result);
    }

    /**
     * Test of right method, of class VectorHeap.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        instance.add("b");
        instance.add("c");
        int result = VectorHeap.right(0);
        assertEquals(2, result);
    }

    /**
     * Test of percolateUp method, of class VectorHeap.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        VectorHeap instance = new VectorHeap();
        instance.add("b");
        instance.add("c");
        instance.add("a");
        instance.percolateUp(2);
        Comparable result = instance.getFirst();
        assertEquals("a",result);
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        Comparable result = instance.getFirst();
        assertEquals("a",result);
    }

    /**
     * Test of pushDownRoot method, of class VectorHeap.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
         VectorHeap instance = new VectorHeap();
        instance.add("c");
        instance.add("b");
        instance.add("a");
        instance.pushDownRoot(0);
        Comparable result = instance.getFirst();
        assertEquals("a",result);
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
         VectorHeap instance = new VectorHeap();
        instance.add("c");
        instance.add("b");
        instance.add("a");
        Comparable result = instance.remove();
        assertEquals("a",result);
    }

    /**
     * Test of getFirst method, of class VectorHeap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        instance.add("c");
        instance.add("b");
        Comparable result = instance.getFirst();
        assertEquals("a",result);
    }

    /**
     * Test of isEmpty method, of class VectorHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VectorHeap instance = new VectorHeap();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        instance.add("a");
        instance.add("c");
        instance.add("b");
        Comparable result = instance.size();
        assertEquals(3,result);
    }
    
}

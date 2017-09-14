package com.fortinet.interview.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LinkedListReverseTest {

    @Test
    public void testEmptyList () {
        int[] a = {};
        LinkedListReverse linkedListReverse = new LinkedListReverse();
        assertNull(linkedListReverse.reverse(linkedListReverse.createListFromArray(a)));
    }

    @Test
    public void testOnlyOneNodeList () {
        int[] a = {2};
        LinkedListReverse linkedListReverse = new LinkedListReverse();
        assertEquals (a[0], linkedListReverse.reverse(linkedListReverse.createListFromArray(a)).val);
    }

    @Test
    public void testManyNodesList () {
        int[] a = {1, 2, 3, 4, 5};
        LinkedListReverse linkedListReverse = new LinkedListReverse();
        LinkedListReverse.Node node = linkedListReverse.reverse(linkedListReverse.createListFromArray(a));

        int i = a.length - 1;
        while (node != null) {
            assertEquals(a[i--], node.val);
            node = node.next;
        }
        assertEquals(-1, i);
    }
}

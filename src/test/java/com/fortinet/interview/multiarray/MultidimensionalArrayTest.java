package com.fortinet.interview.multiarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * All the tests comparisons are based on hard coded return value 2 from getValue method.
 */
public class MultidimensionalArrayTest {

    @Test
    public void testEmptyArray() {
        assertEquals(new Long(0), MultidimensionalArray.sum(new MultidimensionalArray(), new int[]{}));
    }

    @Test
    public void testOneDArray() {
        assertEquals(new Long(2), MultidimensionalArray.sum(new MultidimensionalArray(), new int[1]));
    }

    @Test
    public void testTwoDArray() {
        assertEquals(new Long(4), MultidimensionalArray.sum(new MultidimensionalArray(), new int[]{2, 2}));
    }
}

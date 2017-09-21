package com.fortinet.interview.splitarray;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraysTest {

    @Test
    public void testNullAndEmptyList() {
        List<Integer> integers = null;
        assertFalse (Arrays.canSplitArray(integers, 1));
        integers = new ArrayList<>();
        assertFalse (Arrays.canSplitArray(integers, 1));
    }

    @Test
    public void testOneSublist() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        assertTrue (Arrays.canSplitArray(integers, 1));
    }

    @Test
    public void testSumOfElemsLessThanSubgroupsSize() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        assertFalse (Arrays.canSplitArray(integers, 2));
    }

    @Test
    public void testZeroSubgroups() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(1);
        assertFalse (Arrays.canSplitArray(integers, 0));
    }

    @Test
    public void testRandom1() {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        assertTrue (Arrays.canSplitArray(integers, 3));
    }

    @Test
    public void testRandom2() {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(5);
        integers.add(5);
        integers.add(6);
        assertFalse (Arrays.canSplitArray(integers, 3));
    }

    @Test
    public void testDuplicates() {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(3);
        integers.add(2);
        integers.add(4);
        assertTrue(Arrays.canSplitArray(integers, 3));
    }

    @Test
    public void testDuplicates1() {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(3);
        integers.add(2);
        integers.add(4);
        assertTrue(Arrays.canSplitArray(integers, 2));
    }
}

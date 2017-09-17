package com.fortinet.interview.splitarray;

import java.util.Comparator;
import java.util.List;

public class Arrays {
    static boolean canSplitArray (List<Integer> integers, int noOfSubsets) {
        if (noOfSubsets == 0 || integers == null || integers.isEmpty()) {
            return false;
        }

        if (noOfSubsets == 1) {
            return true;
        }

        int sum = integers.stream().mapToInt(Integer::intValue).sum();
        if (sum % noOfSubsets != 0) {
            return false;
        }

        //Assuming that all integers are positive, sort and check. With negative numbers this conditions could not be true;
        integers.sort(Comparator.naturalOrder());
        if (integers.get(integers.size() - 1) > sum) {
            return false;
        }
        return splitArray(integers, noOfSubsets, sum);
    }

    private static boolean splitArray (List<Integer> integers, int noOfSubsets, int sum) {
        for (int j = 0; j < noOfSubsets; j++) {
            if(!findRemainingInts(integers, sum /  noOfSubsets, integers.size() - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean findRemainingInts (List<Integer> integers, int remainingSum, int from) {

        for (int i = from; i >= 0; i--) {
            if (integers.get(i) == -1 || integers.get (i) > remainingSum) {
                continue;
            }
            if (remainingSum == integers.get(i)) {
                integers.set(i, -1);
                return true;
            }
            if (remainingSum > integers.get(i)) {
                remainingSum = remainingSum - integers.get(i);
                integers.set(i, -1);
                return findRemainingInts(integers, remainingSum, i - 1);
            }
        }
        return false;
    }

//    public static void main(String[] args) {
//        Integer[] arr = new Integer[] {1,1,1};
//        int k = 2;
//        if(Arrays.canSplitArray(java.util.Arrays.asList(arr), k)) {
//            System.out.println("Can split array");
//        } else {
//            System.out.println("Cannot split array");
//        }
//    }


}

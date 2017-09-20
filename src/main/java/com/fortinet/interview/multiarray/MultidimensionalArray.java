package com.fortinet.interview.multiarray;

public class MultidimensionalArray {

    //Assume that we set all elements to 2 hence always returning 2;
    public static Long getValue(int... indexOfDimension) {
        return 2L;
    }

    public static Long sum(MultidimensionalArray mArray, int[] lengthOfDimension) {
        if (lengthOfDimension == null || lengthOfDimension.length == 0) {
            return 0L;
        }

        if (mArray == null) {
            return 0L;
        }
        // test 3d array:3*4*5
        int numberOfDimensions = lengthOfDimension.length;  //3
        int[] index = new int[numberOfDimensions];
        Long total = 0L;
        int dim = 0;
        while (dim < numberOfDimensions) {
            // print (= sum)
            for (int i = 0; i < index.length; i++) {
                System.out.printf("%2d", index[i]);
                total = total + MultidimensionalArray.getValue(index[i]);
            }

            System.out.println();
            // next element
            dim = 0;
            while (dim < numberOfDimensions) {
                index[dim]++;
                if (index[dim] < lengthOfDimension[dim]) {
                    break;
                } else {
                    index[dim] = 0;
                    dim++;
                }
            }
        }
        return total;
    }

    //Time complexity is multiplication of dimensions.
    public static void main(String[] args) {
        MultidimensionalArray mArray = new MultidimensionalArray();
        System.out.println(MultidimensionalArray.sum(mArray, new int[]{3, 3, 3}));
    }
}
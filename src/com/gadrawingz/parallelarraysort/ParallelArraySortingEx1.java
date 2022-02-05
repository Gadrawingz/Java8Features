package com.gadrawingz.parallelarraysort;

import java.util.Arrays;

public class ParallelArraySortingEx1 {
    public static void main(String[] args) {

        int[] myArray = {5, 8, 1, 0, 6, 9};

        // iterating array elements
        for (int i: myArray) {
            System.out.print(i + " ");
        }

        // Sorting Array in parallel
        Arrays.parallelSort(myArray);
        System.out.println("\nArray element after sorting");

        // Iterating array elements
        for (int i:myArray) {
            System.out.print(i + " ");
        }
    }
}

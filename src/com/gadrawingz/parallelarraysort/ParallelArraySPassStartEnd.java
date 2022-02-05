package com.gadrawingz.parallelarraysort;

import java.util.Arrays;

public class ParallelArraySPassStartEnd {
    public static void main(String[] args) {

        // Here we are passing starting and end index of the array

        int[] numArr = {5,8,12, 1,0,6,9,24,50,3,-4, 45}; // Creating an integer array

        // Iterating array elements
        for (int i:numArr) {
            System.out.print(i+" ");
        }

        // Sorting array elements parallel and passing  start, end index
        Arrays.parallelSort(numArr, 0, 5);
        System.out.println("\nArray elements after sorting");

        // Iterating array elements
        for (int i:numArr) {
            System.out.print(i + " ");
        }
        // Here only from 0 to 5 index, will be sorted
        // 5 8 12 1 0 :: 6 9 24 50 3 -4 45
        // 0 1 5 8 12 :: 6 9 24 50 3 -4 45

    }
}

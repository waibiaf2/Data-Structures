package com.datastructures.practice.linear_strcutrues.arrays;

import java.util.HashSet;

public class FindMissingNumber {
    /**
     * Find the Missing Number:
     * Given an array containing ( n ) distinct numbers taken from the range ( 0 ) to ( n ), find the one number that is missing from the array.
     * Example: Input: [3, 0, 1], Output: 2
     * */
    public int findMissingNumSum(int[] arr, int n) {
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public int findMissingNumHashSet(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int i = 0; i < n; i++)
            if (!set.contains(i)) return i;

        return -1;
    }
}

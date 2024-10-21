package com.datastructures.linear_structures.arrays;

import java.util.Arrays;

public class Array {
    private Integer[] items;
    private int count;

    public Array(int size) {
        items = new Integer[size];
    }

    public void insert(int item) {
        // If the array is full, resize it
        if (count == items.length) {
            Integer[] newItems = new Integer[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, count);
           /*for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }*/
            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        //Validate the index
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        // Shift the items in the items to the left to fill the whole
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    
    9
    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);

    }

    public int sumOfArray() {
        /**
        *  * Sum of Array Elements
         * Problem: Write a Java program to sum all the elements of an array.
         * Sample Input: [1, 2, 3, 4, 5]
         * Expected Output: 15
         * */

        //Iterative
        /*int sum = 0;
        for(int num: array) {
            sum += num;
        }
        System.out.println(sum);
        return sum;*/

        //Streams
        /*int sum = Arrays.stream(array).sum();
        System.out.println(sum);
        return sum;*/

        //Recursive
        int sum = sumArray(items, items.length - 1);
        System.out.println(sum);

        return sum;
    }

    private int sumArray(Integer[] array, int n) {
        if(n == 0)
            return array[n];

        return array[n] + sumArray(array, n - 1);
    }

    public int findMaxElement(Integer[] array) {
        /**
         * Find Maximum Element
         * Problem: Write a Java program to find the maximum element in an array.
         * Sample Input: [3, 5, 7, 2, 8]
         * Expected Output: 8
         * */

        //Iterative method
        /*int maxElement = 0;
        for(int num: array) {
            if (num > maxElement) {
                maxElement = num;
            }
        }
        System.out.println(maxElement);
        return maxElement;*/

        //Streams
       /* int max = Arrays.stream(array).max().getAsInt();
        System.out.println(max);
        return max;*/

        //Sorting
        Arrays.sort(array);
        int max = array[array.length - 1];
        System.out.println(max);
        return max;
    }

    public void reverseArray(Integer[] array) {
        /**
         * Reverse an Array
         * Problem: Write a Java program to reverse the elements of an array.
         * Sample Input: [1, 2, 3, 4, 5]
         * Expected Output: [5, 4, 3, 2, 1]
         * */

        /**
         * 1. create a reversed array variable
         * 2. Loop through the provided array
         * 3. push elements from the array, starting with the last one on the reversed array.
         * 4. return the reversed array
        * */

        //Iterration
       /* int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length - 1 - i] = array[i];
        }

        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;*/

        //Use Collections.reverse
        /*List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println(Arrays.toString(list.toArray()));*/

        //String builder method...
        StringBuilder sb = new StringBuilder();
        for(int num : array) {
            sb.append(num).append(" ");
        }

        sb.reverse();

        String[] reversedArray = sb.toString().trim().split(" ");
        System.out.println(Arrays.toString(reversedArray));
        Integer[] results =
            Arrays.stream(reversedArray)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(results));

    }


    /**
     * Sure! Here are some array-based problems in Java, ranging from simple to complex, along with sample input and expected output:

     *
     *******************************************************************
     * Intermediate Problems
     * ***************************************************************
     * Remove Duplicates
     * Problem: Write a Java program to remove duplicate elements from an array.
     * Sample Input: [1, 2, 2, 3, 4, 4, 5]
     * Expected Output: [1, 2, 3, 4, 5]
     *
     * Find Second Largest Element
     * Problem: Write a Java program to find the second largest element in an array.
     * Sample Input: [10, 20, 4, 45, 99]
     * Expected Output: 45
     *
     * Move Zeroes to End
     * Problem: Write a Java program to move all zeroes to the end of an array.
     * Sample Input: [0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9]
     * Expected Output: [1, 9, 8, 4, 2, 7, 6, 9, 0, 0, 0, 0, 0]
     *
     * ************************************************
     * Complex Problems
     * ************************************************
     *
     * Subarray with Given Sum
     * Problem: Write a Java program to find a subarray with a given sum.
     * Sample Input: Array: [1, 4, 20, 3, 10, 5], Sum: 33
     * Expected Output: Subarray found from index 2 to 4
     *
     *
     * Find Missing Number
     * Problem: Write a Java program to find the missing number in an array of size n containing numbers from 1 to n.
     * Sample Input: [1, 2, 4, 6, 3, 7, 8]
     * Expected Output: 5
     *
     *
     * Trapping Rain Water
     * Problem: Write a Java program to find the amount of water that can be trapped after raining.
     * Sample Input: [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
     * Expected Output: 6
     *
     *
     * Longest Consecutive Subsequence
     * Problem: Write a Java program to find the length of the longest consecutive elements sequence.
     * Sample Input: [100, 4, 200, 1, 3, 2]
     * Expected Output: 4 (The longest consecutive elements sequence is [1, 2, 3, 4])
     * */
}

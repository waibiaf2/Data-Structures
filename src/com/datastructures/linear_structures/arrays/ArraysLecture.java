package com.datastructures.linear_structures.arrays;

public class ArraysLecture {
    int[] ages = {20, 22, 18, 48, 26, 87, 70};
    float avg, sum = 0;
    int length = ages.length;
    
    float average() {
        for (int age : ages) {
            sum += age;
        }
        return sum / length;
    }
}


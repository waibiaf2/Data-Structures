package com.datastructures;

import com.datastructures.hashmap.characterFinder;
import com.datastructures.queues.PriorityQueueSt;

public class Main {
    public static void main(String[] args) {
        characterFinder chf = new characterFinder();
        var ch = chf.firstNonRepeatingChar("A Great Apple");
        System.out.println(ch);

    }
}

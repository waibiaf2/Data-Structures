package com.datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class characterFinder {
    //A Green Apple -> This returns "G"
    //a green apple
    public char firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toLowerCase().toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }
}

package com.datastructures.linear_structures.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class characterFinder {
    //A Green Apple -> This returns "G"
    //a green apple
    public char firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        addCharacterToMap(map, str);

        for (var ch : str.toLowerCase().toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    public char firstRepeatingCharacter(String str) {
        // green apple
        //e -> will return as first repeated character.
        Map<Character, Integer> map = new HashMap<>();
        addCharacterToMap(map,str);
        for (var ch : str.toLowerCase().toCharArray()) {
            if (map.get(ch) > 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

    private char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        var strArray = str.toLowerCase().toCharArray();
        for(var ch: strArray) {
           if(set.contains(ch))
               return ch;

           set.add(ch);
        }

        return Character.MIN_VALUE;
    }

    private void addCharacterToMap(Map<Character,Integer> map, String str) {
        var chars = str.toLowerCase().toCharArray();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }
    }
}

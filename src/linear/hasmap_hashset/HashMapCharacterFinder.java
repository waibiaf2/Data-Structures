package linear.hasmap_hashset;

import java.util.HashMap;
import java.util.Map;

public class HashMapCharacterFinder {

    public static char findFirstNonRepeatChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return c;
            }
        }

        return Character.MIN_VALUE;
    }

    public static Character findFirstNonRepeatCharMosh(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();

        for (char c : chars) {
            var count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count + 1);
        }

        for (char c : chars)
            if (map.get(c) == 1)
                return c;

        return Character.MIN_VALUE;
    }

}

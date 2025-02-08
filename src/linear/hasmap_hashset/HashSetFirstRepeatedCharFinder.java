package linear.hasmap_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetFirstRepeatedCharFinder {
    public static char findFirstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                System.out.println(c);
                return c;
            }

            set.add(c);
        }

        return Character.MIN_VALUE;
    }
}

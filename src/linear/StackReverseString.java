package linear;

import java.util.Stack;

public class StackReverseString {
    /*Interview Questions:
     * 1. Reverse a string using a stack
     * */
    public String reverseString(String input) {

        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}

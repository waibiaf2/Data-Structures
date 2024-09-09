package com.datastructures.stacks;

import java.util.Stack;

public class ReverseString {

    /**
     * Reverse string example
     */
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        /*String reversed = "";
        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }*/

        StringBuilder reversed = new StringBuilder();
        /*StringBuffer reversed = new StringBuffer();*/
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}

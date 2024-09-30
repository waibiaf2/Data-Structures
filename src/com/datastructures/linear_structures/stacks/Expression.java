package com.datastructures.linear_structures.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    /**
     * Check if the  provided expression is balanced eg:
     * [1>
     * {{33(9)>}}
     * {{{{{23445<99></99>}}}}}
     * */
    private final List<Character> leftBrackets
        = Arrays.asList('(','{', '[', '<');
    private final List<Character> rightBrackets
        = Arrays.asList(')','}',']','>');

    public boolean ExpressionIsBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if(stack.empty()) return false;

                var top = stack.pop();
                if (bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
        //) -> (
        /*return (right == ')' && left != '(') ||
            (right == '}' && left != '{') ||
            (right == ']' && left != '[') ||
            (right == '>' && left != '<');*/
    }
}

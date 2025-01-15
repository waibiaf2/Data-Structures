package linear;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackExpressionIsBalanced {
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{', '[');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '}', ']');

    public boolean isBalanced(String input) {
        Stack<Character> charStack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                charStack.push(ch);

            if (isRightBracket(ch)) {
                if (charStack.isEmpty()) return false;

                var top = charStack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }

        return charStack.isEmpty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        /*return right == '>' && left != '<' ||
            right == ']' && left != '[' ||
            right == '}' && left != '{' ||
            right == ')' && left != '(';*/
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}

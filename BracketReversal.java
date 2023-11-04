// Count Minimum Reversals to Make Brackets Balanced

import java.util.Stack;

public class BracketReversal {
    public static int countMinReversals(String str) {
        if (str.length() % 2 != 0) {
            return -1; // If the string length is odd, it cannot be balanced.
        }

        Stack<Character> stack = new Stack<>();
        int openCount = 0;

        for (char c : str.toCharArray()) {
            if (c == '{') {
                stack.push(c);
                openCount++;
            } else if (c == '}' && !stack.isEmpty()) {
                stack.pop();
                openCount--;
            }
        }

        int closedCount = str.length() / 2 - openCount;
        return (openCount + 1) / 2 + (closedCount + 1) / 2;
    }

    public static void main(String[] args) {
        String brackets = "{{}}{{}}}}";
        int minReversals = countMinReversals(brackets);
        System.out.println("Minimum reversals needed: " + minReversals);
    }
}

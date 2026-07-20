import java.util.*;

public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                stack.push(i);

            } else {

                stack.pop();

                if (stack.isEmpty()) {

                    stack.push(i);

                } else {

                    maxLength = Math.max(maxLength, i - stack.peek());

                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        System.out.println(longestValidParentheses("(()")); // Example 1:Input: s = "(()"Output: 2Explanation: The
                                                            // longest valid parentheses substring is "()".
        System.out.println(longestValidParentheses(")()())")); // Example 2:Input: s = ")()())"Output: 4Explanation: The
                                                               // longest valid parentheses substring is "()()".
        System.out.println(longestValidParentheses("")); // Example 3:Input: s = ""Output: 0
    }
}
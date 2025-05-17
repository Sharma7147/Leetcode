import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toCharArray()) {
            temp.append(ch);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                stack.pop();
            }

          
            if (stack.isEmpty()) {
           
                result.append(temp.substring(1, temp.length() - 1));
                temp.setLength(0); // clear temp
            }
        }

        return result.toString();
    }
}

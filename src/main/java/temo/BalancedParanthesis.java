package temo;

import java.util.ArrayList;
import java.util.List;

public class BalancedParanthesis {
    // Function to get the corresponding closing parenthesis
    static char checkParenthesis(char c) {
        switch (c) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';
            default:
                return '\0';
        }
    }


    static boolean isValid(String s) {

        List<Character> stack = new ArrayList();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
            } else if (c == ')' || c == '}' || c == ']') {
                int top=stack.size()-1;
                if (stack.isEmpty() || c != checkParenthesis(stack.get(top))) {
                    return false;
                } else {
                    stack.remove(top);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({{}})";

        if (isValid(s)) {
            System.out.println("The string is having balanced parentheses.");
        } else {
            System.out.println("The string is not having balanced parentheses.");
        }
    }
}


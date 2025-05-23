package parenthesis;

import java.util.Stack;

public class DiffrentParenthesis {
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(!((s.charAt(i) == ')' && top == '(') ||
                   (s.charAt(i) == '}' && top == '{') ||
                   (s.charAt(i) == ']' && top == '['))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{[()]}";  // valid
        String test2 = "{[(])}";  // invalid
        String test3 = "({[]})";  // valid
        String test4 = "({[})";   // invalid
        String test5 = "(){}[]({}]";

        System.out.println(isValidParentheses(test1)); // true
        System.out.println(isValidParentheses(test2)); // false
        System.out.println(isValidParentheses(test3)); // true
        System.out.println(isValidParentheses(test4)); // false
        System.out.println(isValidParentheses(test5));
    }
}

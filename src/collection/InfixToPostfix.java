package collection;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() == '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    return "Invalid Expression";
                } else
                    stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    result.append((stack.pop()));
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result.append(stack.pop());

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String infixExpr = "a+b*c" ;
        String postfixExpr = infixToPostfix(infixExpr);
        System.out.println("Infix Expression:   " + infixExpr);
        System.out.println("Postfix Expression: " + postfixExpr);
    }
}



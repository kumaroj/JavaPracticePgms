package Stacks;

import java.util.Stack;

public class InfixtoPostfix {

    public static void main(String[] args) {
        String infix = "q+(c*t)*o+(g*g)+q*(i-a)*p-(i*l)";
        String ans = solve(infix);
        System.out.println(ans);
    }

    public static String solve(String A) {

        String op = "";

        Stack<Character> stack = new Stack<Character>();
        int n = A.length();
        int i = 0;

        while(i<n) {
            if (A.charAt(i) == '(') {
                stack.push(A.charAt(i));

            } else if (A.charAt(i) == '^') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && (stack.peek() == '^')) {
                        op += stack.pop();
                    }
                    stack.push(A.charAt(i));
                } else
                    stack.push(A.charAt(i));

            } else if (A.charAt(i) == '/') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && (stack.peek() == '^'||stack.peek() == '/'|| stack.peek() == '*')) {
                        op += stack.pop();
                    }
                    stack.push(A.charAt(i));
                } else
                    stack.push(A.charAt(i));

            } else if (A.charAt(i) == '*') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && (stack.peek() == '^'||stack.peek() == '/'|| stack.peek() == '*')) {
                        op += stack.pop();
                    }
                    stack.push(A.charAt(i));
                } else
                    stack.push(A.charAt(i));

            } else if (A.charAt(i) == '+') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && (stack.peek() == '^' || stack.peek() == '*'|| stack.peek() == '/'
                    || stack.peek() == '+' || stack.peek() == '-' )) {
                        op += stack.pop();
                    }
                    stack.push(A.charAt(i));
                } else
                    stack.push(A.charAt(i));

            } else if (A.charAt(i) == '-') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && (stack.peek() == '^' || stack.peek() == '*'|| stack.peek() == '/'
                            || stack.peek() == '+' ||stack.peek() == '-' )) {
                        op += stack.pop();
                    }
                    stack.push(A.charAt(i));
                } else
                    stack.push(A.charAt(i));

            } else if (A.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty() && (stack.peek() != '(')) {
                        op += stack.pop();
                    }
                    stack.pop();
                }
            }
                else
                    op += A.charAt(i);

                i++;
        }

        while(!stack.isEmpty())
          op+=stack.pop();
        return op;
    }
}

package Stacks;

import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {

        String ans = solve("ab");
        System.out.println(ans);
    }

    public static String solve(String A){

        String ans = "";
        String rev = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i<A.length(); i++){
            if (!stack.isEmpty()){
                if (A.charAt(i) == stack.peek()){
                    stack.pop();
                }
                else
                    stack.push(A.charAt(i));
            }
            else
                stack.push(A.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }


}

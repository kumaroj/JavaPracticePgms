package Stacks;

import java.util.Stack;

public class SimplifyDirectoryPath {

    public static void main(String[] args) {
        String ans = simplifyPath("/a/./b/../../c/");
        System.out.println(ans);
    }

    public static  String simplifyPath(String A) {

        Stack<Character> stack = new Stack<Character>();


        String res = "";
        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == '/'){
                if (!stack.isEmpty()){
                    if (stack.peek()=='.'){
                        stack.pop();
                    }
                    else{
                        if (stack.peek()!='/'){
                            stack.push(A.charAt(i));
                        }
                    }
                }
                else{
                    if (stack.isEmpty()){
                        stack.push(A.charAt(i));
                    }
                }
            }
            else if (A.charAt(i) == '.'){
                if (!stack.isEmpty()){
                   if (stack.peek() == '.'){

                       stack.pop();
                       stack.pop();
                       stack.pop();
                   }
                   else{
                       stack.push(A.charAt(i));
                   }
                }
            }
            else{
                stack.push(A.charAt(i));
            }

        }

        while(!stack.isEmpty()){
            res+=stack.pop();
        }
        String rev = "";
        for (int i = res.length()-1; i>=0; i--){
            rev+=res.charAt(i);
        }
        if (rev.charAt(rev.length()-1) == '/')
            rev = rev.substring(0 , rev.length()-1);


        return rev;
    }

}

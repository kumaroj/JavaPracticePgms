package Stacks;

import java.util.Stack;

public class SortStack {






    public static void main(String[] args) {

        Stack<Integer> inp = new Stack<Integer>();
        inp.push(1);
        inp.push(8);
        inp.push(7);
        inp.push(2);
        inp.push(6);
        inp.push(5);
        inp.push(3);
        inp.push(4);

        SortStack sortstack = new SortStack();
        Stack<Integer> sortedstack = sortstack.MergeSort(inp);
        System.out.println(sortedstack);

    }

    public Stack<Integer> MergeSort(Stack<Integer>s){

        if (s.size() == 1)
            return s;

        int size = s.size()/2;
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        while(size>0){
            s1.push(s.pop());
            size--;
        }

        while(s.size()!=0)
          s2.push(s.pop());

        s1 = MergeSort(s1);
        s2 = MergeSort(s2);

        return merge(s1 , s2);
    }

    public Stack<Integer> merge(Stack<Integer>s1 , Stack<Integer>s2){
       Stack<Integer> temp = new Stack<Integer>();
       Stack<Integer> ans = new Stack<Integer>();

       while (s1.size()!=0 && s2.size()!=0){
           if(s1.peek()>=s2.peek()){
               temp.push(s1.pop());
           }
           else{
               temp.push(s2.pop());
           }
       }
        if (s1.size() == 0){
            while(s2.size()!=0)
                temp.push(s2.pop());
        }
        else if (s2.size() == 0){
            while(s1.size()!=0)
                temp.push(s1.pop());
        }

        while(temp.size()!=0)
            ans.push(temp.pop());

        return  ans;
    }
}

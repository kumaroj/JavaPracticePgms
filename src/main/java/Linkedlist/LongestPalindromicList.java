package Linkedlist;


public class LongestPalindromicList {

    static class Node{
        int val;
        Node next;

        public  Node(int val){
            this.val = val;
            next = null;
        }
    }

    public static void main(String[] args) {

       int []A = {1,2, 1 , 3 , 4, 5, 4, 3 , 2 , 1};
       Node  head = new Node(A[0]);
       Node temp = head;

       for(int i = 1 ;i<A.length; i++){
          Node x = new Node(A[i]);
          temp.next = x;
          temp = x;
       }
       temp = head;

       for (int i = 0; i<A.length; i++){

           System.out.print(temp.val);
           System.out.print("-->");

           temp = temp.next;
       }
        System.out.println();
        int ans = solve(head);
       System.out.println(ans);
    }

    public static int solve(Node head){


            int maxlengthodd = Integer.MIN_VALUE;
            int maxlengtheven = Integer.MIN_VALUE;
            int oddcnt = 1;
            int evencnt = 0;
            int maxlength = Integer.MIN_VALUE;
            Node h1 = head;
            Node h2 = head.next;
            h1.next = null;

            while(h2!=null){
                Node temp = h2.next;

                //odd palindrome
                Node x = h1;
                Node y = temp;
                while(x!=null && y!=null){
                    if (x.val != y.val){
                        break;
                    }
                    else{
                        oddcnt+=2;
                        x = x.next;
                        y = y.next;
                    }
                }
                maxlengthodd = Math.max(maxlengthodd , oddcnt);
                oddcnt = 1;
                //even palindrome
                 x = h1;
                 y = h2;
                while(x!=null && y!=null){
                    if (x.val != y.val){
                        break;
                    }
                    else{
                        evencnt+=2;
                        x = x.next;
                        y = y.next;
                    }
                }
                maxlengtheven = Math.max(maxlengtheven , evencnt);
                evencnt = 0;

                maxlength = Math.max(maxlengtheven , maxlengthodd);

                h2.next = h1;
                h1 = h2;
                h2 = temp;

            }
        return maxlength;
    }
}

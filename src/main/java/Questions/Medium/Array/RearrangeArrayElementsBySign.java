package Questions.Medium.Array;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int []arr = {1,2,-4,-5};
        int []ans = rearrangeArrayElements(arr);

        System.out.println(Arrays.toString(ans));
    }

    public static  int[] rearrangeArrayElements(int[] arr){

/*       int[]positive = new int [arr.length/2];
       int[]negative = new int [arr.length/2];

       int x= 0;
       int y = 0;
       for (int i = 0; i<arr.length; i++) {
           if (arr[i] > 0) {
               positive[x] = arr[i];
               x++;
           } else {
               negative[y] = arr[i];
               y++;
           }
       }
       int pos = 0;
       int nve = 1;
       for (int j = 0; j<positive.length; j++){
           arr[pos] = positive[j];
           pos+=2;
       }

        for (int k = 0; k< negative.length; k++){
            arr[nve] = negative[k];
            nve+=2;
        }*/

        //Optimized Approach

        int pve = 0;
        int nve = 1;
        int[] ans = new int[arr.length];

        for (int i = 0; i<arr.length; i++){

                if (arr[i]>0){
                    ans[pve] = arr[i];
                    pve+=2;
                }
                else {
                    ans[nve] = arr[i];
                    nve+=2;
                }
            }

        return ans;
    }
}

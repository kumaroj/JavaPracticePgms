package Questions.Medium.Array;

import java.util.Arrays;

public class RearrangearrayElementsBySignII {
    public static void main(String[] args) {

      int []arr = {1,2,-4,-5,3,4};
      int []ans =  rearrangeNumbers(arr);
      System.out.println(Arrays.toString(ans));
    }

    public static  int [] rearrangeNumbers(int []arr ){

        int pve = 0;
        int nve = 1;
        int[] ans = new int[arr.length];

        for (int i = 0; i<arr.length; i++){
            if(pve <arr.length && nve< arr.length){
                if (arr[i]>0){
                    ans[pve] = arr[i];
                    pve+=2;
                }
                else {
                    ans[nve] = arr[i];
                    nve+=2;
                }
            }

        }

        return ans;
    }
}

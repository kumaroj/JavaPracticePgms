package Questions.Array.Easy;

import java.util.Arrays;

public class MovesZeroEnd {
    public static void main(String[] args) {

        int[]nums =  {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
       int [] ans = movesZeroEnd(nums);
        System.out.println(Arrays.toString(ans));
    }

    public  static int[] movesZeroEnd(int[]nums){
        int zero = 0;
        int nonzero = 0;

        for(int i = 0; i<nums.length; i++){
          if (nums[i]>0){
              nums[nonzero] = nums[i];
              nonzero++;
          }
        }

        zero = nonzero;
        for (int j = zero; j<nums.length; j++){
            nums[j] = 0;
        }
    return nums;
    }
}

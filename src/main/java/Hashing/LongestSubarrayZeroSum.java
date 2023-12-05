package Hashing;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public static void main(String[] args) {
        int []arr = {19, -4, 4, -2, 7, -5};
        int ans =  longestsubarrayzeroSum(arr);
        System.out.println(ans);
    }

    public  static int longestsubarrayzeroSum(int []arr){
        int length = 0;
        int maxlength = 0;
        int n = arr.length;
        int currsum = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i<n ; i++){
            currsum+=arr[i];
            if(currsum == 0){
                length = i+1;
                maxlength = Math.max(length , maxlength);
            }
            else if (map.containsKey(currsum)){
                length = i - map.get(currsum);
                maxlength = Math.max(length , maxlength);
            }
            else
                map.put(currsum , i);


        }

        return maxlength;
    }
}

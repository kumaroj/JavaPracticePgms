package Problems;

import java.util.Arrays;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[]keyboards = {3,1};
        int[]drives = {5,2, 8};
        int b = 10;
        int ans =  getMoneySpent(keyboards , drives, b);
        System.out.println(ans);
    }

    public static int getMoneySpent(int[]keyboards, int[]drives , int b){

        int maxcost = Integer.MIN_VALUE;
        int ans = 0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int i = 0;
        int j = drives.length-1;

        while(i<keyboards.length && j>=0){

            int sum = keyboards[i] + drives[j];
            if (sum == b)
                return sum;
            else if (sum>b)
                j--;
            else {
                maxcost = Math.max(sum, maxcost);
                if (maxcost<b)
                    ans = maxcost;
                i++;

            }
        }

        return ans;
    }
}

package tct1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[]arr = {10, 22, 12, 3, 0, 6};
        List<Integer> op = getLeaderArray(arr);
        System.out.println(op);
    }

    public  static  List<Integer> getLeaderArray(int[]arr){
        int max = arr[arr.length-1];
        List<Integer> leaders = new ArrayList<Integer>();
        leaders.add(arr[arr.length-1]);

        for (int i = arr.length-2; i>=0; i--){
            if (arr[i]>max){
               leaders.add(arr[i]);
               max = arr[i];
            }
        }
        return leaders;
    }
}

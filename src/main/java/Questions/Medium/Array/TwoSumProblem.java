package Questions.Medium.Array;

import java.util.HashMap;

public class TwoSumProblem {
    public static void main(String[] args) {
        int []arr = {2 , 6, 5,8, 11};
        int target = 14;
        boolean isSum = twoSumProblem(arr , target);

        System.out.println(isSum);
    }

    public static boolean twoSumProblem(int []arr , int target){
  /*      int sum = 0;
        for (int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                if (sum == target){
                    return true;
                }
            }
        }
        return false;*/
     HashMap<Integer , Integer>  map =  new HashMap<Integer , Integer>();
       /*for(int i = 0; i<arr.length; i++){
        if(!map.containsKey(arr[i]))
            map.put(arr[i] , 1);
        else
            map.put(arr[i] , map.get(arr[i])+1);

        for (int j = 0; j<arr.length; j++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                if (diff !=arr[i])
                    return true;
               else if (diff == arr[i] && map.get(diff)>1){
                    return true;
                }
            }
        }
    }*/
        for(int i = 0; i<arr.length; i++){
            int diff = target - arr[i];
            if (map.containsKey(diff))
                return true;
            map.put(arr[i] , i);
        }

        return false;
    }
}

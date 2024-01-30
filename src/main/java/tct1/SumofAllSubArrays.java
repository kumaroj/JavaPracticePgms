package tct1;

public class SumofAllSubArrays {

    public static void main(String[] args) {
        int[]arr = {1 , 2, 3 , 4};
        int ans = AllSubarraySum(arr);
        System.out.println(ans);

    }

    public  static int sumAllSubArrays(int [] arr) {
        int arrsum = 0;
        int allSubArraysSum = 0;


        for (int i = 0; i < arr.length; i++) {
            arrsum = 0;
            for (int j = i; j < arr.length; j++) {
                arrsum += arr[j];
                allSubArraysSum += arrsum;
            }
        }
        return allSubArraysSum;
    }

    public  static int AllSubarraySum(int [] arr){
        int s = 0;
        int e = 0;
        int sum = 0;

        for (int i = 0; i<arr.length; i++){
            s = i+1;
            e = arr.length-i;
            sum+=(s*e)*arr[i];
        }

        return  sum;
    }


}

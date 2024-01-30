package tct1;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr1[] = {1, 3 , 7, 4, 11, 15, 8, 13};
        int sumGiven = 33;
        boolean result = SubarraySum(arr1 , sumGiven);
        System.out.println(result);

    }

    public  static  boolean SubArrayGivenSum(int[] arr , int sum){

       int arr1[] = {1, 3 , 7, 4, 11, 15, 8, 13};
       int sumGiven = 33;
       int arrsum = 0;

        //Brute Force Approach
        for (int i = 0; i<arr1.length; i++){
            arrsum = 0;
             for(int j = i ; j<arr1.length; j++){
                 arrsum+=arr1[j];
                 if (arrsum == sumGiven)
                     return  true;
             }
        }
        return false;
    }

    public  static boolean SubarraySum(int[] arr , int sum){

        int arrsum = 0;
        int i = 0;
        for (int j = 0; j<arr.length; j++){
           if (arrsum<sum){
               arrsum+=arr[j];
            }
           else if (arrsum == sum){
               return  true;
           }
           while (arrsum>sum  && i<j){
               arrsum = arrsum - arr[i];
               i++;
           }

        }
        return false;
    }
}

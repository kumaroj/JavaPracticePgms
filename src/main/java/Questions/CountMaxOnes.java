package Questions;

public class CountMaxOnes {

    public static void main(String[] args) {
        int[] arr = {1 , 0, 1, 1 ,0, 0, 1, 1, 1,1 ,1};
        int ans =  countConsecutiveOnes(arr);
        System.out.println(ans);
    }
    public  static int countConsecutiveOnes(int []arr){

        int maxcnt = 0;
        int cnt = 0;

        for (int i = 0; i<arr.length; i++){

            if (arr[i] == 1){
                cnt++;
                maxcnt = Math.max(maxcnt , cnt);
            }
            else if (arr[i] == 0){
                cnt = 0;
            }
        }
        return maxcnt;
    }
}

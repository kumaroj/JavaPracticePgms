package InterviewQuestions;

import java.util.Arrays;

public class ArraangingZerosandNumbers {

    //ip  int[]arr = {2 , 0, 1, 0, 0, 9, 0, 7, 0, 8, 0, 0};
    //op int[]arr = {1 , 9, 7 , 8,  0, 0, 0, 0,, 0, 0};

    public static void main(String[] args) {
        int ip[] = {2, 0, 1, 0, 0, 9, 0, 7, 0, 8, 0, 0};
        rearrange(ip);
    }

    public static void rearrange(int[]arr){

        int i = 0;
        int j = i+1;

        while(i<arr.length && j<arr.length){
            if (arr[i]  == 0 && arr[j]!= 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
           else if (arr[i] == 0 && arr[j] == 0){
               // i++;
                j++;
            }
           else if (arr[i]!=0 && arr[j] ==0){
               i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}

package sdesheet;

import java.util.Arrays;

public class zigzagFashion {

    public static void main(String[] args) {
        int arr[] = {6202, 4625, 5469, 2038, 5916, 3405, 5533, 7004, 2469, 9853, 4992, 361, 9819, 3294, 7195 ,4036,
                9404, 8767, 5404, 1711, 3214, 3100, 3751, 2139 ,5437 ,4993, 1759, 9572, 6270, 3789 ,9623 ,2472 , 9493};
        zigzag(arr , arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public  static void zigzag(int[]a , int n){
        for (int i = 0; i<n-1; i++){
            if (a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
        int cnt = 0;
        cnt = n%2 ==0?n-2:n-1;

        for (int i = 1; i<cnt; i=i+2){
            if (a[i]<a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
    }
}

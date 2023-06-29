package searching;

import java.util.ArrayList;
import java.util.List;

public class MedianArray {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

//        a.add(1);
//        a.add(4);
//        a.add(5);

        a.add(1);
        a.add(2);
        a.add(3);

        b.add(4);
        // b.add(3);

//        b.add(2);
//        b.add(3);

       double ans = findMedianSortedArrays(a , b);
        System.out.println(ans);


    }

    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        double median = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minA = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;
        int minB = Integer.MAX_VALUE;
        int maxB = Integer.MIN_VALUE;

        int length = a.size() + b.size();

        for (int i = 0; i<a.size(); i++){
            minA = Math.min(a.get(i) , minA);
            maxA = Math.max(a.get(i) , maxA);
        }
        for (int i = 0; i<b.size(); i++){
            minB = Math.min(b.get(i) , minB);
            maxB = Math.max(b.get(i) , maxB);
        }

        min = Math.min(minB , minA);
        max = Math.max(maxB , maxA);
        if (length%2 != 0){
           median = binarySearch(a , b , min , max , (length/2)+1);
        }
        else{
           double median1 = binarySearch(a , b , min , max , (length/2)+1);
           double median2 = binarySearch(a , b , min , max , (length/2));

           median = (median1  + median2)/2;
        }
        return  median;

    }


    public static  int countElements(List<Integer>A, int a){
        int cnt = 0;

        for (int i = 0; i<A.size(); i++){
            if (A.get(i)<=a)
                cnt++;
        }
        return cnt;
    }

    public static int binarySearch(List<Integer> a , List<Integer> b ,int min , int max , int B){
        int s = min;
        int e = max;
        int mid = -1;
        int median = -1;

        while(s<=e) {

            mid = (s + e) / 2;

            int c1 = countElements(a, mid);
            int c2 = countElements(b, mid);

            if ((c1 + c2) >= B) {
                median = mid;
                e = mid - 1;
            } else
                s = mid + 1;
        }
        return  median;
    }
}

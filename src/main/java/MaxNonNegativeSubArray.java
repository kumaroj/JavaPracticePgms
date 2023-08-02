import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {

    public static void main(String[] args) {
        int []A = {1 , 2, 5, -7, 2, 5};

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(1);
        al1.add(2);
        al1.add(5);
        al1.add(-7);
        al1.add(2);
        al1.add(5);
        ArrayList<Integer> ans = maxSet(al1);
        System.out.println(ans);
    }
    public static ArrayList<Integer> maxSet(ArrayList<Integer>A){
        int start = -1;
        int end = -1;
        int tmp_start = 0, tmp_end = 0;
        long sum = Integer.MIN_VALUE;
        long tmp_sum = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                tmp_start = i+1;
                tmp_end = i+1;
                tmp_sum = 0;
            }else{
                tmp_sum += A.get(i);
                if(tmp_sum>sum){
                    start = tmp_start;
                    end = i;
                    sum = tmp_sum;
                }
                else if(tmp_sum == sum && (tmp_end-tmp_start > end-start)){
                    start = tmp_start;
                    end = i;
                    sum = tmp_sum;
                }
                tmp_end++;
            }
        }
        //  System.out.println(start+" "+end);

        ArrayList<Integer> res = new ArrayList<Integer>();
        if(start == -1) return res;
        for(int i=start; i<=end;i++){
            res.add(A.get(i));
        }
        return res;
    }


}

package tct1;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = { 2,2,1,1,1,2,2};
        int element = majorityElement(arr);
        System.out.println(element);
    }

    public static int majorityElement(int[]arr){

        int cnt = 0;
        int ele = 0;
        for(int i = 0 ; i<arr.length; i++){

            if (cnt  == 0){
                ele = arr[i];
            }
            else if (ele == arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return ele;
    }
}

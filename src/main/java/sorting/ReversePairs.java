package sorting;

public class ReversePairs {

    int reversepair = 0;
   // [14046,57239,78362,99387,27609,55100,65536,62099,40820,33056,88380,78549,57512,33137,81212,32365,42276,65368,52459,74924,25355,76044,78056,45190,94365,58869,20611]
    public static void main(String[] args) {
        int []A = {1 ,3,2,3,1};
        ReversePairs reversepairs = new ReversePairs();
        reversepairs.solve(A);

        System.out.println(reversepairs.reversepair);

    }

    public void solve(int[] A) {

        mergeSort(A , 0 , A.length-1);

    }

    public void mergeSort(int []A , int s, int e){

        if (s ==e )
            return;
        int mid = (s+e)/2;
        mergeSort(A , s , mid);
        mergeSort(A , mid+1 , e);
        merge(A , s , mid , e);
    }

    public void merge(int []A , int s , int mid , int e){

        int n1 = mid-s+1;
        int n2 = e-(mid+1) +1;
        int[]arr1 = new int[n1];
        int[]arr2 = new int[n2];


        int startidx = 0;

        for(int i = s ; i<=mid; i++){
            arr1[startidx] = A[i];
            startidx++;
        }
        startidx = 0;

        for(int j = mid+1 ; j<=e; j++){
            arr2[startidx] = A[j];
            startidx++;
        }

        int i = 0; int j = 0; int index = s;
        while(i<n1 && j<n2) {
            if (arr1[i] <= arr2[j]) {
                A[index] = arr1[i];
                index++;
                i++;
            } else if (arr1[i] > arr2[j]) {
               // reversepair += n1 - i;
                if(arr1[i] >((long)2*arr2[j])){
                    reversepair+= n1-i;
                }
                else if (arr1[i] ==((long)2*arr2[j])){
                    reversepair+= (n1-1)-(i+1)+1;
                }
                A[index] = arr2[j];
                index++;
                j++;
            }
        }
            while(i<n1){
               A[index] = arr1[i];
               i++;
               index++;
            }
            while(j<n2){
                A[index] = arr2[j];
                j++;
                index++;
            }

    }

}

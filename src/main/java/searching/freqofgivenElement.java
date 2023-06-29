package searching;

public class freqofgivenElement {
    public static void main(String[] args) {

        int []A = {-5 , -5 , -3, 0, 0, 1, 1, 5,5,5,5,5,5,5,8,10, 10, 15};
        int B = 5;

       int ans = solve(A , B);
        System.out.println(ans);

    }

    public static int solve (int [] A , int B){

        int ans = -1;
        int x = firstBinarySearch(A , B);
        int y = lastbinarySearch(A , B);

        ans = y-x+1;

        return ans ;
    }

    public static int firstBinarySearch(int [] A , int B){
        int first = -1;
        int s = 0;
        int e = A.length - 1;
        int mid = -1;
        while(s<=e){
          mid = (s+e)/2;

          if (A[mid] == B){
              first = mid;
              e = mid -1;
          }
          else if (A[mid]>B)
              e = mid -1;

          else
              s = mid+1;
        }
        return first;
    }

    public static int lastbinarySearch(int [] A , int B){
        int last = -1;
        int s = 0;
        int e = A.length - 1;
        int mid = -1;
        while(s<=e){
            mid = (s+e)/2;

            if (A[mid] == B){
                last = mid;
                s = mid +1;
            }
            else if (A[mid]>B)
                s = mid+1;
            else
                e = mid - 1;
        }
        return last;
    }
}

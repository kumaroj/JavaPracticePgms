package InterviewQuestions;

public class SecondSmallestElement {

    public static void main(String[] args) {
        int []a = {5,6,1,2,3,4};
        int ans = secondSmallestElement(a);
        System.out.println(ans);
    }

    public static int secondSmallestElement(int []a){
        int smallest = a[0];
        int secondSmallest = a[0];
        for (int i = 0; i<a.length; i++){
            if (a[i]<smallest){
                secondSmallest = smallest;
                smallest = a[i];

            } else if (a[i]<secondSmallest) {
                secondSmallest = a[i];
            }
        }

        return secondSmallest;
    }
}

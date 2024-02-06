package tct1;

public class SortAlphaBetsReverseOrder {
    public static void main(String[] args) {

        String input = "Manish Kumar Ojha";
        String sortedString = sortAlphabeticallyReverse(input);
        System.out.println(sortedString);

    }

    public  static  String sortAlphabeticallyReverse(String s){

        String sorted = "";
        s = s.replaceAll("\\s" , "").toLowerCase();
        char[]arr = s.toCharArray();

       for (int i = 0; i<arr.length; i++){
           for(int j = i+1; j<arr.length; j++){
               if(arr[i]<arr[j]){
                   char temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }

       for (int i = 0; i<arr.length; i++){
           sorted+=arr[i];

       }
     return sorted;
    }

}

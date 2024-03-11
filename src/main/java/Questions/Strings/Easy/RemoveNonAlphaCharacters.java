package Questions.Strings.Easy;

public class RemoveNonAlphaCharacters {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String ans = "";
       for( char x :s.toCharArray()){
           if (Character.isLetter(x)){
               ans+=x;
           }
       }


    }

    public static boolean reverse(String str  , int s , int e){

        return  false;
    }

}

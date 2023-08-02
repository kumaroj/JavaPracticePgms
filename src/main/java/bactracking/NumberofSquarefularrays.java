package bactracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NumberofSquarefularrays {

    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        Set<ArrayList<Integer>>ans = new HashSet<ArrayList<Integer>>();
        arrlist.add(41);

        boolean freq[] =  new boolean[arrlist.size()];
        sqaurefulArrays(arrlist , new ArrayList<Integer>() , freq , ans);
        System.out.println(ans);
    }

    public static void sqaurefulArrays(ArrayList<Integer> A, ArrayList<Integer>ip , boolean[]freq ,
                                 Set<ArrayList<Integer>> ans){
        if (ip.size() == A.size()){
            boolean flag = true;
            for (int i = 0; i< ip.size()-1; i++) {
              double sqrt =  Math.sqrt(ip.get(i)+ip.get(i+1));
              if (sqrt - Math.floor(sqrt) == 0)
                  continue;
              else {
                 flag = false;
                  break;
              }
            }
            if (flag)
              ans.add(new ArrayList<>(ip));
            return;
        }

        for(int i = 0; i<A.size(); i++){
            if (!freq[i]){
                ip.add(A.get(i));
                freq[i] = true;
                sqaurefulArrays(A , ip , freq , ans);
                ip.remove(ip.size()-1);
                freq[i] = false;
            }
        }

    }
}

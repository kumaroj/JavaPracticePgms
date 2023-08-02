package bactracking;

import java.net.Inet4Address;
import java.util.*;

public class SubsetsII {

    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(2);
        ArrayList<ArrayList<Integer>> ans = subsetsWithDup(arrlist);
        System.out.println(ans);
    }
    public  static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> currlist = new ArrayList<Integer>();
        Collections.sort(A);
        generateSubsets(A , 0 ,currlist, set);
        for (ArrayList x:set
        ) {
            ans.add(x);
        }

        Collections.sort(ans , (o1 , o2)->{
           int min = Math.min(o1.size(), o2.size());
           for (int i = 0; i<min; i++){
               if (o1.get(i) == o2.get(i))
                   continue;
                else
                    return o1.get(i) - o2.get(i);
           }
           return o1.size() -o2.size();
        });
        return ans;
    }

    public static  void generateSubsets(ArrayList<Integer>A , int idx , ArrayList<Integer>currlist,  Set<ArrayList<Integer>> set ){

        if (idx == A.size()){
         ArrayList<Integer>  ds = new ArrayList<Integer>();
         ds.addAll(currlist);
         set.add(ds);
         return;
        }
        currlist.add(A.get(idx));
        generateSubsets(A , idx+1, currlist , set);
        currlist.remove(currlist.size()-1);
        generateSubsets(A , idx+1 , currlist, set);
    }
}

package bactracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllUniquePermutations {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        ArrayList<ArrayList<Integer>> ans = permute(arrlist);
        System.out.println(ans);
    }
    public  static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        generatepermutations(A , 0 , set);
        for (ArrayList x:set
             ) {
            ans.add(x);
        }
        return ans;
    }

    public static  void generatepermutations(ArrayList<Integer> A , int index , Set<ArrayList<Integer>> ans ){

        if (index == A.size()){
            ArrayList<Integer> ds = new ArrayList<Integer>();
            for (int j = 0; j<A.size(); j++){
                ds.add(A.get(j));
            }
            ans.add(ds);
            return ;
        }
          for(int i = index ; i<A.size(); i++){
              swap(i, index , A);
              generatepermutations(A , index+1 , ans);
              swap(i, index , A);
          }

    }

    public static void swap(int i , int j , ArrayList<Integer>A){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j , temp);
    }

}

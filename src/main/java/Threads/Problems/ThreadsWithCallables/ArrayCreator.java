package Threads.Problems.ThreadsWithCallables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {

    private int n;
    private List<Integer>nums;

    ArrayCreator(int n){
        this.n = n;
        nums = new ArrayList<>();
    }
    @Override
    public List call() throws Exception {

      for (int i = 1; i<=n ; i++){
          nums.add(i);
      }
        return nums;
    }
}

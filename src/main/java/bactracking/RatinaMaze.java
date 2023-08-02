package bactracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatinaMaze {
    public static void main(String[] args) {
        ArrayList<Integer> al1 ;
        ArrayList<Integer> al2;
        ArrayList<Integer> al3 ;

        ArrayList<ArrayList<Integer>> maze = new ArrayList<ArrayList<Integer>>();
        al1 = new ArrayList<Integer>();
        al2 = new ArrayList<Integer>();
        al3 = new ArrayList<Integer>();

        al1.add(1);
        al1.add(1);
        al1.add(1);

        al2.add(1);
        al2.add(0);
        al2.add(1);

        al3.add(1);
        al3.add(0);
        al3.add(1);

        maze.add(al1);
        maze.add(al2);
        maze.add(al3);

        ArrayList<ArrayList<Integer>> path = solve(maze);
        System.out.println(path);
    }
    public static  ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
        int n = A.size();

        for (int i = 0; i<n; i++){
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int j = 0; j<n ; j++){
                al.add(0);
            }
            path.add(al);
        }
        if (A.get(0).get(0) == 0)
            return path;
        findPath(A , path , 0 , 0, n);
        return path;
    }

    public static void findPath(ArrayList<ArrayList<Integer>> A , ArrayList<ArrayList<Integer>> path , int i , int j , int n ){
            if (i ==n-1 && j ==n-1  && A.get(i).get(j) ==1 ){
                path.get(i).set(j, 1);
                return;
            }

            if (i == n || j ==n )
                return ;


          if (i+1<n && A.get(i+1).get(j)!=0 && A.get(i+1).get(j)!=2){
              A.get(i).set(j ,2);
              path.get(i).set(j, 1);
              findPath(A , path , i+1 , j, n);
              A.get(i).set(j ,1);

          }

          if (j+1<n && A.get(i).get(j+1)!=0 && A.get(i).get(j+1)!=2){
              A.get(i).set(j ,2);
              path.get(i).set(j, 1);
              findPath(A , path , i , j+1, n);
              A.get(i).set(j ,1);

          }



    }


    boolean probeRatPathInMaze(int[][] maze, int[][] pathInMaze, int N, int row, int col) {
        // Base Case
        if (row == N - 1 && col == N - 1 && maze[row][col] == 1) {
            pathInMaze[row][col] = 1;
            return true;
        }

        if (row == N || col == N) { // either row or col is exhausted
            return false;
        }

        // Main Logic
        if (maze[row][col] == 1) {
            pathInMaze[row][col] = 1;

            // go right and explore
            if (probeRatPathInMaze(maze, pathInMaze, N, row, col + 1)) {
                return true;
            }

            // go down and explore
            if (probeRatPathInMaze(maze, pathInMaze, N, row + 1, col)) {
                return true;
            }

            // reset the value in the path
            pathInMaze[row][col] = 0;
        }

        return false;
    }


}

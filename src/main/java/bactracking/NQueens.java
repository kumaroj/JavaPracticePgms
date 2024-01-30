package bactracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        List<List<String>> res = solveNQueens(4);
        for (int i = 0; i <res.size(); i++) {
            System.out.println(res);
        }
    }

    public static List<List<String>> solveNQueens(int n){

       List<List<String>> ans = new ArrayList<List<String>>();
       char[][]board = new char[n][n];
       for (int i = 0;i<n ; i++)
           for(int j = 0; j<n ; j++)
               board[i][j] = '.';

       ans.add(construct(board));

       return ans;
    }

    public static void queensArrangement(char[][]board , List<List<String>>ans , int col , int n ){
        if(col == n){
            ans.add(construct(board));
            return;
        }

        for (int row = 0; row<n ; row++ ){
            if (isValid(row , col , board , n)){
                board[row][col] = 'Q';
                queensArrangement(board, ans , col+1 , n);
                board[row][col] = '.';
            }
        }
    }

    public static  boolean isValid(int row, int col, char[][]board , int n){

        int i = row;
        int j = col;

        while(j>=0){
            if (board[i][j] == 'Q') return  false;
            j--;
        }
        i = row;
        j = col;

        while(i>= 0 && j>=0){
            if (board[i][j] == 'Q') return  false;
            i--             ; j--;
        }
        i = row;
        j = col;
        while (i<n && j>=0){
            if (board[i][j] == 'Q') return  false;
            i++; j--;
        }
        return true;
    }

    public  static List < String > construct(char[][] board) {
        List < String > res = new ArrayList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}

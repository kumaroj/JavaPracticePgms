package InterviewQuestions;

public class SetMatrixZero {
    public static void main(String[] args) {

        int[][]matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] zeroMatrix = setMatrixZero(matrix);

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix.length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public  static  int[][] setMatrixZero(int [][]arr){

        for (int i = 0; i<arr.length; i++){
             for(int j = 0; j< arr[i].length; j++){
                 if (arr[i][j] == 0){
                     for(int k = 0 ; k< arr[i].length; k++){
                         arr[i][k] = 0;
                     }
                     for (int l = 0; l<arr.length; l++){
                         arr[l][j] = 0;
                     }
                 }
             }
        }
        return  arr;
    }

}

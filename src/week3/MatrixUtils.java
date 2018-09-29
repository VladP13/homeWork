package week3;

import week2.ArrayUtills;

public class MatrixUtils {
     public static int[][] generetaMatrix(int tapes, int columns, int range){
         int[][] matrix = new int[tapes][columns];

         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 matrix[i][j] = ArrayUtills.genNum(range);
             }
         }
         return matrix;
     }

}

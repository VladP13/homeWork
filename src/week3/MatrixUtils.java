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

    public static String[][] generetaField(int tapes, int columns) {
        String[][] matrix = new String[tapes][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ".";
            }
        }
        return matrix;
    }

    public static void printMatrix(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static String[] generateShip(int length) {
        String[] resultArray = new String[length];

        for (int i = 0; i < length; i++) {
            resultArray[i] = "X";
        }
        return resultArray;
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void printMatrix(boolean[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static boolean palindrom(String word) {

        char[] masChars = word.toCharArray();

        for (int i = 0; i < masChars.length / 2; i++) {
            if (masChars[i] != masChars[masChars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}

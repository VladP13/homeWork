package week3;

//1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.generetaMatrix(3, 5, 20);
        MatrixUtils.printMatrix(mat);
        System.out.println(" ");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 5 == 0) {
                    mat[i][j] = 8;
                }
            }
        }
        MatrixUtils.printMatrix(mat);

    }

}

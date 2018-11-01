package week3;

import week2.ArrayUtills;

//4. Создать массив, который будет состоять из диагонали матрицы
//		1 3 5
//		4 5 7  -  1 5 6
//		4 5 6
public class Task4 {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.generetaMatrix(4, 5, 10);
        MatrixUtils.printMatrix(mat);
        System.out.println("");

        int[] mas = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    mas[i] = mat[i][j];
                }
            }
        }
        ArrayUtills.printArray(mas);
    }
}

package week3;

//2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.
public class Task2 {
    public static void main(String[] args) {

        boolean[][] mat = new boolean[5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    mat[i][j] = true;
                }
            }
        }
        MatrixUtils.printMatrix(mat);
    }
}

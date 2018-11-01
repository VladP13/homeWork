package week3;

//   b) Поменять наибольший и наименьший столбик в двухмерном массиве.
public class Task5b {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.generetaMatrix(4, 7, 10);
        MatrixUtils.printMatrix(mat);
        System.out.println(" ");

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < mat[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum += mat[j][i];
            }

            if (sum > max) {
                max = sum;
                maxIndex = i;
            }
            if (sum < min) {
                min = sum;
                minIndex = i;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            int temp1 = mat[i][maxIndex];
            mat[i][maxIndex] = mat[i][minIndex];
            mat[i][minIndex] = temp1;
        }

        MatrixUtils.printMatrix(mat);


    }
}

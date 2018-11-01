package week3;

//5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве.
// (Размер - сумма элементов в строке)
public class Task5 {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.generetaMatrix(4, 3, 10);
        MatrixUtils.printMatrix(mat);
        System.out.println(" ");

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
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

        int[] temp = mat[maxIndex];
        mat[maxIndex] = mat[minIndex];
        mat[minIndex] = temp;

        MatrixUtils.printMatrix(mat);
    }
}

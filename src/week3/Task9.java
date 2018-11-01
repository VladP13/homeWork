package week3;


//9. Умножить две матрицы.
public class Task9 {
    public static void main(String[] args) {

        int[][] mas1 = MatrixUtils.generetaMatrix(4, 4, 10);
        int[][] mas2 = MatrixUtils.generetaMatrix(4, 4, 10);

        MatrixUtils.printMatrix(mas1);
        System.out.println(" ");
        MatrixUtils.printMatrix(mas2);
        System.out.println(" ");

        int[][] resMas = new int[mas1.length][mas2[0].length];

        for (int i = 0; i < resMas.length; i++) {
            for (int j = 0; j < resMas[i].length; j++) {
                resMas[i][j] = mas1[i][j] * mas2[i][j];
            }
        }

        MatrixUtils.printMatrix(resMas);
    }
}

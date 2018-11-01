package week3;

import java.util.Scanner;

//11. Повернуть матрицу(Двухмерный массив).
// Матрица квадратная. Пользователь вводит угол кратный 90.
public class Task11 {
    public static void main(String[] args) {

        int[][] mat = MatrixUtils.generetaMatrix(5, 5, 10);
        MatrixUtils.printMatrix(mat);

        Scanner sc = new Scanner(System.in);
        System.out.println("введите угол кратный 90");
        int ugol = sc.nextInt();


    }
}

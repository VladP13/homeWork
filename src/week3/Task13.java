package week3;

import week2.ArrayUtills;

import java.util.Scanner;

//13. Написать морской бой(1 корабль).
// Размер поля указывает пользователь. При промахе показывать подсказку.
public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter field size ");
        int sizeMat = sc.nextInt();
        String[][] fieldSize = MatrixUtils.generetaField(sizeMat, sizeMat);
        MatrixUtils.printMatrix(fieldSize);

        System.out.println("size ship");
        String[] ship = MatrixUtils.generateShip(3);

    }
}

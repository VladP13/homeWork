package week1;//17. Написать программу вычисления идеального веса пользователя (рост-100).
// Выдать рекомендации о необходимости поправиться либо похудеть.

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("height");
        double height = sc.nextInt();

        System.out.println("weight");
        double weight = sc.nextInt();

        int indexMasTil = (int) (weight / ((height / 100) * (height / 100)));

        if (indexMasTil < 26 && indexMasTil > 20) {
            System.out.println(indexMasTil + " the weight is perfect");
        } else if (indexMasTil < 20) {
            System.out.println(indexMasTil + " you need to gain some weight");
        } else {
            System.out.println(indexMasTil + " you need to lose weight");
        }

    }
}

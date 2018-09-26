package week1;//3. Пользователь вводит число.
// Вывести на экран его удвоенное значение, если число делится на 7 нацело.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        double numb = sc.nextDouble();

        if (numb % 7 == 0) {
            System.out.println(numb = numb * 2);
        } else {
            System.out.println(numb / 7);
        }
    }
}

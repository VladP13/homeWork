package week1;//1. Пользователь вводит параметр с консоли (текущий час от 0 до 24).
// Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int numb = sc.nextInt();

        if (numb >= 9 && numb <= 18) {
            System.out.println("I'm at work");
        } else {
            System.out.println("I rest");
        }

    }
}

package week1;

import java.util.Scanner;

//4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно not in the range от 0 до 1
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        double numb = sc.nextDouble();

        if (numb >= 0 && numb <= 1) {
            System.out.println("in the range");
        } else {
            System.out.println("not in the range");
        }
    }
}

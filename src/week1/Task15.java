package week1;//15. Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о времени года.
// Если пользователь введет недопустимое число, программа должна выдать сообщение об ошибке.

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number from 1 to 12");
        int numb = sc.nextInt();

        if (numb >= 1 && numb <= 2 || numb == 12) {
            System.out.println("winter");
        } else if (numb >= 3 && numb <= 5) {
            System.out.println("spring");
        } else if (numb >= 6 && numb <= 8) {
            System.out.println("summer");
        } else if (numb >= 9 && numb <= 11) {
            System.out.println("autumn");
        } else {
            System.out.println(false);
        }
    }
}

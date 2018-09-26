package week1;/*11. Дано трехзначное число. Определить:
        а) верно ли, что все его цифры одинаковые;
        б) есть ли среди его цифр одинаковые.*/

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter three-digit number");

        int numb = sc.nextInt();

        if (numb / 100 == numb % 10 && numb % 100 / 10 == numb % 10) {
            System.out.println("all digits are the same");
        } else if (numb / 100 == numb % 10 || numb % 100 / 10 == numb % 10 ||
                numb / 100 == numb % 100 / 10) {
            System.out.println("there are numbers identical");
        }
        /*System.out.println(numb / 100);
        System.out.println(numb % 100 / 10);
        System.out.println(numb % 10);*/

    }
}

package week1;
//	1) Перевод с числа с десятичной системы счисления в двоичную, и наоборот.
// Пользователь сам вводит число

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int numb = sc.nextInt();
        int division = 0;

        while (numb > 0) {
            System.out.print(numb % 2 + " ");
            division = numb / 2;
            numb = division;
        }


    }
}

package week1;//2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();

        if (numb1 > numb2 && numb1 > numb3) {
            System.out.println(numb1 + " the largest  number");
        } else if (numb2 > numb1 && numb2 > numb3) {
            System.out.println(numb2 + " the largest  number");
        } else {
            System.out.println(numb3 + " the largest number");
        }

        if (numb1 < numb2 && numb1 < numb3) {
            System.out.println(numb1 + " the smallest  number");
        } else if (numb2 < numb1 && numb2 < numb3) {
            System.out.println(numb2 + " the smallest  number");
        } else {
            System.out.println(numb3 + " the smallest  number");
        }

    }
}

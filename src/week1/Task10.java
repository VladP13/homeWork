package week1;//10. Ввести с клавиатуры три числа, положительные возвести в куб, а отрицательные заменить на 0.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();

        if (numb1 < 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.pow(numb1, 3));
        }

        if (numb2 < 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.pow(numb2, 3));
        }

        if (numb3 < 0) {
            System.out.println(0);
        } else {
            System.out.println(Math.pow(numb3, 3));
        }
    }
}

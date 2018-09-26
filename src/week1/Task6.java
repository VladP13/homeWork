package week1;//6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();

        if (numb1 + numb2 >= 11 && numb1 + numb2 <= 19) {
            System.out.println(numb1 + numb2);
        }
    }
}

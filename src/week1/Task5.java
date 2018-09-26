package week1;

import java.util.Scanner;

//5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
// Если второе больше, то выводим сумму.
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();

        if (numb1 > numb2) {
            System.out.println(numb1 - numb2);
        } else {
            System.out.println(numb1 + numb2);
        }

    }
}
package week1;
//19. Написать программу,
// которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка" в правильной форме.
// Например, 1 копейка, 5 копеек, 42 копейки.

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter numb of coin");
        int coin = sc.nextInt();

        if (coin == 1 || coin == 21 || coin == 31 || coin == 41 ||
                coin == 51 || coin == 61 || coin == 71 || coin == 81 || coin == 91) {
            System.out.println(coin + " копейка");

        } else if (coin >= 2 && coin <= 4 || coin >= 22 && coin <= 24 ||
                coin >= 32 && coin <= 34 || coin >= 42 && coin <= 44 ||
                coin >= 52 && coin <= 54 || coin >= 62 && coin <= 64 ||
                coin >= 72 && coin <= 74 || coin >= 82 && coin <= 84 ||
                coin >= 92 && coin <= 94) {
            System.out.println(coin + " копейки");
        } else {
            System.out.println(coin + " копеек");
        }
    }
}

package week3;


//6. Нули. Найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
//		Вход:
//		10001101001
//
//		Выход:
//		(2,4) - цепочка нулей
//		(5,6) - цепочка единиц

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int couterNull = 0;
        int indexNullStart = 0;
        int indexNullEnd = 0;
        int counterOne = 0;
        int indexOneStart = 0;
        int indexOneEnd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter numb");

        String a = sc.nextInt() + "";
        char[] mas = a.toCharArray();

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] == 0) {
                indexNullStart = i;
                continue;
            }
        }
    }
}

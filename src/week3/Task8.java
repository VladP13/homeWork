package week3;

import java.util.Scanner;

//8. Верхний регистр.Напишите программу, которая позволяет пользователю ввести в консоли строку,
//   переводит первый символ слов в верхний регистр и результат выводит в консоль
//		Вход:
//		иван васильевич
//
//		Выход:
//		Иван Васильевич
public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter words");
        String a = sc.nextLine();
        String[] mas = a.split(" ");
        String res = " ";

        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i].substring(0, 1).toUpperCase() + mas[i].substring(1);
            res += mas[i] + " ";

        }
        System.out.println(res);


    }
}

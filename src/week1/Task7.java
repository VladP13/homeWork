package week1;//7. Вводим два числа, если одно из них делиться на другое без остатка,
// то выводим тру и показываем результат деления (целую часть от деления  и остачу),
// в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();

        if (numb1 % numb2 == 0) {
            System.out.println(true);
            System.out.println(numb1 / numb2 + " ціла частина");
            System.out.println(numb1 % numb2 + " остача");
        } else {
            System.out.println(false);
            System.out.println(numb1 / numb2 + " ціла частина");
            System.out.println(numb1 % numb2 + " остача");
        }

        if (numb2 % numb1 == 0) {
            System.out.println(true);
            System.out.println(numb2 / numb1 + " ціла частина");
            System.out.println(numb2 % numb1 + " остача");
        } else {
            System.out.println(false);
            System.out.println(numb2 / numb1 + " ціла частина");
            System.out.println(numb2 % numb1 + " остача");
        }
    }
}

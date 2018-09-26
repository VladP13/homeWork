package week1;/*8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        124    4    -   true
        1456   567  -   false
        1      2    -   false
        18     98   -   true*/

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();

        if (numb1 % 10 == numb2 % 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

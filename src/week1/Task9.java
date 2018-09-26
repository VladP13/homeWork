package week1;

import java.util.Scanner;

//9. Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить,
// является ли он прямоугольным. Ответ вывести в виде сообщения.
public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //У прямокутному трикутнику сума квадратів катетів дорівнює квадрату гіпотенузи.
        //с^ = a^ + b^

        System.out.println("Enter the values of the three sides of the triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("прямокутник трикутний");
            } else {
                System.out.println("непрямокутний");
            }
        } else if (b > a && b > c) {
            if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
                System.out.println("прямокутник трикутний");
            } else {
                System.out.println("непрямокутний");
            }
        } else {
            if (Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
                System.out.println("прямокутник трикутний");
            } else {
                System.out.println("непрямокутний");
            }
        }
        /*int max = Math.max(a, b);
        int min = Math.min()
        if (max > c) {


        }*/
    }
}

package week1;

import java.util.Scanner;

//13. Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных
public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers");
        int numb1 = sc.nextInt();
        int numb2 = sc.nextInt();
        int numb3 = sc.nextInt();

        if (numb1 == numb2 || numb1 == numb3 ||
                numb2 == numb3) {
            System.out.println("there is at least one pair of equal");
        } else {
            System.out.println("there are no equal");
        }

    }
}

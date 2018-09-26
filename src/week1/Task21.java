package week1;
//21. Даны три числа A,B,C. Увеличить числа в два раза, если A+B+C>0, в противном случае заменить на нули.


import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter three numbers");

        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        if (one + two + three > 0) {
            one = one * 2;
            two = two * 2;
            three = three * 2;
        } else {
            one = 0;
            two = 0;
            three = 0;
        }
    }
}

package week1;
//2) Вычислить факториал числа.


import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        //3! = 1 · 2 · 3 = 6

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        int numb = sc.nextInt();
        int sum = 1;

        for (int i = 1; i < numb; i++) {
            sum += sum * i;
        }
        System.out.println(sum);
    }
}

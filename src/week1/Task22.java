package week1;
//22. Определить, является ли шестизначное число "счастливым"
// (сумма первых трех цифр равна сумме последних трех цифр).


import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a six-digit number");
        int numb = sc.nextInt();

        if ((numb / 100000) + (numb / 10000 % 10) + (numb / 1000 % 10) ==
                (numb / 100 % 10) + (numb / 10 % 10) + (numb % 10)) {
            System.out.println("number happy");
        } else {
            System.out.println("number unhappy");
        }
    }
}

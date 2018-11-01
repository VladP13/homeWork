package week2.homeWork;

//4. Порахувати кількість букв "а"
// (або будь-який інший символ, вводиться користувачем) в заданому рядку (стрічці).

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter sumvol");
        String sumvol = sc.nextLine();

        System.out.println(" enter word");
        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (sumvol.equals(word.substring(i, i + 1))) {
                count++;
            }
        }
        System.out.println(count);

    }
}

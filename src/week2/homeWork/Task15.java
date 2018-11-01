package week2.homeWork;

//6. Замінити в стрічці всі символи "а" на "@", вивести отриманий результат. Наприклад:
//	"array is a data type" -> "@rr@y is @ d@t@ type"

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter word");
        String word = sc.nextLine();
        String res = "";

        for (int i = 0; i < word.length(); i++) {
            res = word.replaceAll("a", "@");
        }

        System.out.println(res);


    }
}

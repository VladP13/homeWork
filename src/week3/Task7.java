package week3;

//7. Найти самое длинное слово в строке(разделенное одним пробелом)

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter words");
        String a = sc.nextLine();
        String res = " ";
        int numb = 0;

        String[] words = a.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > numb) {
                res = words[i];
                numb = words[i].length();

            }
        }
        System.out.println(res);
    }
}

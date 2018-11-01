package week3;

import java.util.Scanner;

//10. Удалить из предложения слова которые повторяются.
public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter words");

        String line = sc.nextLine();

        String[] mas = line.split(" ");


        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length - 1; j++) {
                if (mas[i].equals(mas[j + 1])) {
                    line = line.replace(mas[i], "");
                }
            }
        }
        System.out.println(line);
    }
}

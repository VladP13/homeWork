package week3;


import java.util.Scanner;

//3. Написать метод, который проверяет является ли строка палиндромом
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter word");
        String word = sc.nextLine();

        boolean palindrom = MatrixUtils.palindrom(word);
        System.out.println(palindrom);

    }
}

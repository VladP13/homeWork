package week1;
//3) Порахувати, скільки разів зустрічається цифра в 8 в заданому числі, яке вводить користувач.
//		5678 - 1
//		6882 - 2


import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");

        int numb = sc.nextInt();
        int counter = 0;
        int division = 0;

        for (int i = 0; i < numb; i++) {
            if (numb % 10 == 8) {
                counter++;
                division = numb / 10;
                numb = division;
            } else {
                division = numb / 10;
                numb = division;
            }
        }
        System.out.println(counter);

    }
}

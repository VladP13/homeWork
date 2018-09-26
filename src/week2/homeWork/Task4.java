package week2.homeWork;
//5. Порахувати, скільки разів зустрічається число (число задає користувач) в масиві.


import week2.ArrayUtills;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int numb = sc.nextInt();
        int counter = 0;

        int[] mas = ArrayUtills.generateArray(numb, numb * 2);

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == numb) {
                counter++;
            }
        }
        ArrayUtills.printArray(mas);
        System.out.println(counter);
    }
}

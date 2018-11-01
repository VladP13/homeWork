package week2.homeWork;

//5. Здвинути масив на задану кількість позицій. Наприклад:
//	{1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}.

import week2.ArrayUtills;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        int[] mas = ArrayUtills.generateArray(5, 10);
        ArrayUtills.printArray(mas);

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number");
        int numb = sc.nextInt();

        int[] res = ArrayUtills.ArrayRight(mas, numb);
        ArrayUtills.printArray(res);


        int[] left = ArrayUtills.ArrayLeft(mas, numb);
        ArrayUtills.printArray(left);

    }


}

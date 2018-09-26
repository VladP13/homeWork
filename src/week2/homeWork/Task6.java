package week2.homeWork;
//7. Знайти середнє арифметичне масиву.

import week2.ArrayUtills;

public class Task6 {
    public static void main(String[] args) {
        int[] mas = ArrayUtills.generateArray(5, 10);
        int arithmeticMean = 0;

        for (int i = 0; i < mas.length; i++) {
            arithmeticMean += mas[i];
        }
        ArrayUtills.printArray(mas);
        System.out.println(arithmeticMean / mas.length);
    }
}

package week2.homeWork;
//2. Знайти мінімальне і максимальне значення в масиві, вивести їх в консоль.


import week2.ArrayUtills;

public class Task1 {
    public static void main(String[] args) {

        int[] mas = ArrayUtills.generateArray(10, 20);

        int max = 0;
        int min = mas[0];

        max = ArrayUtills.getMax(mas);
        min = ArrayUtills.getMin(mas);

        System.out.println(min);
        System.out.println(max);
        ArrayUtills.printArray(mas);
    }
}

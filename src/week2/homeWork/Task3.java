package week2.homeWork;
//4. Дано два масиви однакової довжини з будь-якими значеннями. Скопіювати дані з першого масиву в другий.


import week2.ArrayUtills;

public class Task3 {
    public static void main(String[] args) {

        int[] mas1 = ArrayUtills.generateArray(10, 10);
        int[] mas2 = ArrayUtills.generateArray(10, 10);
        ArrayUtills.printArray(mas1);
        ArrayUtills.printArray(mas2);

        mas2 = mas1;
        ArrayUtills.printArray(mas1);
        ArrayUtills.printArray(mas2);
    }
}

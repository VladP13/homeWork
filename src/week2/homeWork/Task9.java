package week2.homeWork;


import week2.ArrayUtills;

//10. Створити 2 масиви з випадковими числами від 25 до 75.
// Визначити, в якого з них більше парних елементів.
public class Task9 {
    public static void main(String[] args) {

        int count1 = 0;
        int count2 = 0;

        int[] mas1 = ArrayUtills.generateArrayLimitNumber(10, 25, 75);
        int[] mas2 = ArrayUtills.generateArrayLimitNumber(10, 25, 75);

        ArrayUtills.printArray(mas1);
        ArrayUtills.printArray(mas2);

        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] % 2 == 0) {
                count1++;
            }
        }

        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 2 == 0) {
                count2++;
            }
        }

        if (count1 > count2) {
            System.out.println(count1 + " в першому більше");
        } else {
            System.out.println(count2 + " в другому більше");
        }


    }
}

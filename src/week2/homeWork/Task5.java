package week2.homeWork;

import week2.ArrayUtills;

//6. Заповнити масив випадковими значеннями. На парних індексах парними значеннями, на непарних індексах - непарними.
public class Task5 {
    public static void main(String[] args) {

        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            int random = (int) (Math.random() * 100);

            if (random % 2 == 0 && i % 2 == 0) {
                mas[i] = random;
            } else if (random % 2 == 0 && i % 2 != 0) {
                mas[i] = random + 1;
            } else if (random % 2 != 0 && i % 2 == 0) {
                mas[i] = random + 1;
            } else if (random % 2 != 0 && i % 2 != 0) {
                mas[i] = random;
            }
        }
        ArrayUtills.printArray(mas);

    }
}

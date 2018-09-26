package week2.homeWork;
//3. Поміняти місцями найбільший і найменший елемент в масиві.


import week2.ArrayUtills;

public class Task2 {
    public static void main(String[] args) {

        int[] mas = ArrayUtills.generateArray(5, 15);

        ArrayUtills.printArray(mas);

        int indexMin = 0;
        int indexMax = 0;
        int min = mas[0];
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                indexMin = i;
            }
        }

        mas[indexMax] = min; // в індекс записуєм мін значення;
        mas[indexMin] = max;

        ArrayUtills.printArray(mas);


    }
}

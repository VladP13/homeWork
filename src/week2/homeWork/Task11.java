package week2.homeWork;
//2. Інвертувати масив (розвернути) без використання додаткового масиву.


import week2.ArrayUtills;

public class Task11 {
    public static void main(String[] args) {

        int[] mas = ArrayUtills.generateArray(5, 10);
        ArrayUtills.printArray(mas);

        for (int i = 0; i < mas.length / 2; i++) {
            int element = mas[i];
            mas[i] = mas[mas.length - i - 1]; // мінус поточний індекс ,і мінус 1,тому що останній елемент мінус 1;
            mas[mas.length - i - 1] = element;
        }

        ArrayUtills.printArray(mas);

    }
}
package week2.homeWork;
//8. Вивести в консоль елементі тієї половини масиву, у якої середнє арифметичне максимальне.


import week2.ArrayUtills;

public class Task7 {
    public static void main(String[] args) {

        int[] mas = ArrayUtills.generateArray(10, 15);

        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < mas.length / 2; i++) {
            sum1 += mas[i];
        }

        for (int i = mas.length / 2; i < mas.length; i++) {
            sum2 += mas[i];
        }

        int arithmeticMean1 = sum1 / (mas.length / 2);
        int arithmeticMean2 = sum2 / (mas.length / 2);

        if (arithmeticMean1 > arithmeticMean2) {
            System.out.println(arithmeticMean1 + " first half");
        } else {
            System.out.println(arithmeticMean2 + " second half");
        }


    }
}

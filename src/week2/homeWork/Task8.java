package week2.homeWork;


import week2.ArrayUtills;

//9. Дано два масиви однакової довжини arr1 i arr2.
// Вивести в консоль значення масиву, який отримаємо в результаті arr1[i] + arr2[i]
public class Task8 {
    public static void main(String[] args) {

        int[] arr1 = ArrayUtills.generateArray(10, 10);
        int[] arr2 = ArrayUtills.generateArray(10, 10);

        ArrayUtills.printArray(arr1);
        ArrayUtills.printArray(arr2);

        int[] res = new int[arr1.length];

        for (int i = 0; i < res.length; i++) {
            res[i] = arr1[i] + arr2[i];
        }
        ArrayUtills.printArray(res);
    }
}

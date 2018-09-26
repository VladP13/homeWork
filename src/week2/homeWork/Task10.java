package week2.homeWork;


import week2.ArrayUtills;

//11. Написати метод, який буде обрізати масив по заданому початковому та кінцевому індексу.
//	public static int[] splitArray(int[] arr, int start, int end)
//		{ // обрезать массив по границам start и end
//		}
public class Task10 {
    public static void main(String[] args) {

        int[] mas = ArrayUtills.generateArray(10, 10);
        int[] mas1 = ArrayUtills.splitArray(mas, 1, 7);
        ArrayUtills.printArray(mas);
        ArrayUtills.printArray(mas1);
    }

    
}

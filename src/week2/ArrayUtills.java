package week2;

public class ArrayUtills {
    public static int[] generateArray(int length, int limit) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random();
            int element = (int) (limit * random);
            resultArray[i] = element;
        }
        return resultArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public boolean firstLast6(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            }
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }

    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public static int getMax(int[] mas) {
        int max = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    public static int getMin(int[] mas) {

        int min = mas[0];

        for (int j = 0; j < mas.length; j++) {
            if (mas[j] < min) {
                min = mas[j];
            }
        }
        return min;
    }

    public static int[] generateArrayLimitNumber(int length, int ot, int doo) {
        int[] resultArray = new int[length];

        for (int i = 0; i < length; i++) {
            double random = Math.random();
            resultArray[i] = (int) ((random * (doo - ot)) + ot);
        }
        return resultArray;
    }

    public static int[] splitArray(int[] arr, int start, int end) {

        int[] res = new int[end - start];

        for (int i = 0; i < res.length; i++) {
            res[i] = arr[start];
            start++;
        }
        return res;
    }

    public static int genNum(int range) {
        return (int) (Math.random() * range);

    }

    public static int[] ArrayRight(int[] mas, int numb) {
        for (int i = 0; i < numb; i++) {
            int element = mas[mas.length - 1];//сохряняєм останній елемент
            for (int j = mas.length - 1; j > 0; j--) {
                mas[j] = mas[j - 1]; // 1,2,3,4,5 ->  в астанній елемент записуєм попередній і рухаємося далі в ліво;
            }

            mas[0] = element;
        }
        return mas;
    }

    public static int[] ArrayLeft(int[] mas, int numb) {

        for (int i = 0; i < numb; i++) {
            int element = mas[0];
            for (int j = 0; j < mas.length - 1; j++) {
                mas[j] = mas[j + 1];
            }
            mas[mas.length - 1] = element;
        }
        return mas;
    }
}

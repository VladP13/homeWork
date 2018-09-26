package week2;

public class ClassWork {
    public static void main(String[] args) {

        int[] salaries = {555, 554, 723, 665, 785, 400};
        int sum = sum(salaries);
        System.out.println(sum);
    }

    public static int sum(int[] mas) {

        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 5 == 0)
                sum += mas[i];
        }
        return sum;
    }
}

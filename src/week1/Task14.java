package week1;//14. У вас есть скорость и растояние, за какое время вы приедете в пукт назначания

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("speed");
        float speed = sc.nextInt();

        System.out.println("distance");
        float distance = sc.nextInt();

        System.out.println(distance / speed + " time");


    }
}

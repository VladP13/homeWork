package week1;//12. Известны две скорости, одна в километрах в час, другая в метрах в секунду. Какая из них больше?

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the speed in kilometers per hour");
        int kilometrHour = sc.nextInt();

        System.out.println("enter the speed in meters per second");
        int metrSec = sc.nextInt();

        if (kilometrHour > metrSec * 3.6) {
            System.out.println("speed in kilometers per hour more");
        } else {
            System.out.println("speed in meters per second more");
        }


    }
}

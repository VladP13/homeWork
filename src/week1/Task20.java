package week1;
//20. Написать программу,
// которая в зависимости от характера ветра выдает сообщение о его скорости от 1до 4 м/с - слабый (1);
// от 5-10 м/c - умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).


import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter wind speed");
        int windSpeed = sc.nextInt();

        if (windSpeed >= 1 && windSpeed <= 4) {
            System.out.println("wind weak");

        } else if (windSpeed >= 5 && windSpeed <= 10) {
            System.out.println(" wind moderate");
        } else if (windSpeed >= 11 && windSpeed <= 18) {
            System.out.println("wind strog");
        } else {
            System.out.println("wind hurricane");
        }
    }
}

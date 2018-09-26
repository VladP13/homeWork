package week1;
//18. Написать программу вычисления стоимости переговоров, если по субботам и воскресеньям предоставляется 20% скидка.
// Ввести продолжительность разговора и день недели (цифра от 1 до 7).


import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //System.out.println("one minute of conversation costs 10 rubles");

        System.out.println("enter the day of the week");
        int day = sc.nextInt();

        //int price = 10;

        System.out.println(" enter talk time");
        int talkTime = sc.nextInt();

        if (day == 6 || day == 7) {
            System.out.println("you can talk for " + talkTime * 0.2 + " minutes more");
        } else {
            System.out.println("There are no discounts on this day - " + talkTime + " minutes" + " talk time");
        }
    }
}

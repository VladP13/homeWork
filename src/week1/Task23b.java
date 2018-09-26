package week1;
////	б) уместится ли квадрат в круге.

import java.util.Scanner;

public class Task23b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the area of the circle");

        int ploschaKruga = sc.nextInt();
        int radius = (int) Math.sqrt(ploschaKruga / 3.14);
        int diametr = radius * 2;

        System.out.println("enter the area of the square");

        int ploschaKvadrata = sc.nextInt();
        int storona = (int) Math.sqrt(ploschaKvadrata);
        int diagonal = (int) (storona * Math.sqrt(2));

        if (diagonal <= diametr) {
            System.out.println("fit");
        } else {
            System.out.println("no fit");
        }
    }
}

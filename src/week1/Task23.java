package week1;
//23. Известны площади круга и квадрата. Определить:
//	а) уместится ли круг в квадрат;
//	б) уместится ли квадрат в круге.


import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the area of the circle");
        int ploschaKruga = sc.nextInt();
        int radius = (int) Math.sqrt(ploschaKruga / 3.14);
        //Math.sqrt(radius);
        int diametr = radius * 2;

        System.out.println("enter the area of the square");
        int ploschaKvadrata = sc.nextInt();
        int storona = (int) Math.sqrt(ploschaKvadrata);

        if (diametr < storona) {
            System.out.println("fit");
        } else {
            System.out.println("no fit");
        }

    }
}

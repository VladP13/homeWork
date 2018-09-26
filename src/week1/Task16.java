package week1;

import java.util.Scanner;

//16. Вычислить стоимость покупки с учетом скидки.
// Скидка в 10% предоставляется, если сумма покупки превышает 1000 гривен.
public class Task16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" purchase price");

        int purchasePrice = sc.nextInt();
        double discount = 0.9;

        if (purchasePrice >= 1000) {
            System.out.println(purchasePrice * discount);
        } else {
            System.out.println("price without discount");
        }


    }
}

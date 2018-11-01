package week2.homeWork;

//3. Перевірити, чи являється задане число простим.


import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int numb = sc.nextInt();
        /*if(numb == 2){
            System.out.println("simple number");
        }else if(numb < 2){
            System.out.println("not a simple number");
        }*/

        int counter = 0;
        for (int i = 1; i < numb; i++) {
            if (numb % i == 0) {
                counter++;
            }
        }

        if (counter > 1) {
            System.out.println(" not a simple number");
        } else {
            System.out.println(" simple number");
        }

        /*if(numb == 2){
            System.out.println(" simple number");
        }else if(numb < 2 || numb % 2 == 0){
            System.out.println(" not a simple number");
        }*/
    }
}

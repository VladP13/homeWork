package week3;

import java.util.Scanner;

//12. Строки. Ввод пароля.
//		Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза.
//      Пароль должен удовлетворять следующим требованиям:

//		- длинна пароля должна быть от 8 до 20 символов
//		- в пароле должны быть как маленькие так и большие буквы
//		- должны быть цифры
//		- не должен содержать слов 'password', 'pass', 'gfhjkm'
//		- генерировать случайный пароль используя символы: a-z A-Z 0-9
public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter password ");
        String passw1 = sc.nextLine();
        MetodPassword.checkPassword(passw1);

        System.out.println(" enter password again");
        String passw2 = sc.nextLine();
        boolean badpass = MetodPassword.checkPassword(passw2);

        if (badpass) {
            System.out.println("bad password");
            System.out.println("enter Password size is more than 8");

            int passSize = sc.nextInt();

            String password = MetodPassword.genPassword(passSize);
            System.out.println(password);
        } else {
            System.out.println("cooll password");
        }
    }
}

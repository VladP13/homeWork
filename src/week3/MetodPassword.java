package week3;

public class MetodPassword {
    public static boolean checkPassword(String password) {
        return (password.length() < 8 || password.length() > 20 ||
                password.equals("password") || password.equals("pass") ||
                password.equals("gfhjkm") || password.matches("[^0-9a-zA-Zа-яА-Я]+"));
    }

    public static String genPassword(int passSize) {
        if (passSize < 8) {
            System.out.println("small password");
        }
        String password = "";
        String sumvolu = "qazwsxedcrfvtgbyhnujmiklopQAZWSXEDCRFVTGBYHNUJMIKLOP1234567890";
        char[] mas = sumvolu.toCharArray();

        for (int i = 0; i < passSize; i++) {
            int parol = (int) (Math.random() * mas.length);
            password += mas[parol];
        }
        return password;
    }
}

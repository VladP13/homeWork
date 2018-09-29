package week3;

public class EmploeeTest {
    public static void main(String[] args) {
         Emploee emploee = new Emploee();
         emploee.name = "vlad";
         emploee.salary = 100000000;

         Emploee emploee1 = new Emploee();
         emploee1.name = "Petro";
         emploee1.salary = 345346;

         Emploee emploee2 = new Emploee();
         emploee2.name = "Ivan";
         emploee2.salary = 25464;

         Emploee[] emploeeMas = new Emploee[3];
         emploeeMas[0] = emploee;
         emploeeMas[1] = emploee1;
         emploeeMas[2] = emploee2;

         int sum = 0;

        for (int i = 0; i < emploeeMas.length; i++) {
            sum += emploeeMas[i].salary;
        }
        System.out.println(sum);
    }
}
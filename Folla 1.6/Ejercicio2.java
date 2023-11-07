import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Cuantas veces quieres que te salude?");
        int num = escaner.nextInt();

        Double ran;

        for (int i = 1; i <= num; i++) {
            ran = Math.random();
            if (ran < 0.33) {
                System.out.println("Heeeey!");
            }
            else if (ran < 0.67) {
                System.out.println("Buenas!");
            }
            else {
                System.out.println("Holaaaa!");
            }
        }
        escaner.close();
    }
}
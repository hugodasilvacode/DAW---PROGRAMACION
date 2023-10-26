import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Cuantas veces quieres que te salude?");
        int num = escaner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Hola!");
        }

        escaner.close();
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        int num = escaner.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Par");
            }
            else {
                System.out.println("Impar");
            }

            System.out.println("\nIntroduce un numero entero");
            num = escaner.nextInt();
        }

        escaner.close();
    }
}
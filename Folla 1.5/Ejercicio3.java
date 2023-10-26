import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce una palabra");
            String palabra = escaner.next();

            System.out.println(palabra);
        }

        escaner.close();
    }
}
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        escaner.useDelimiter("\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce una frase");
            String palabra = escaner.next();

            System.out.println(palabra);
        }

        escaner.close();
    }
}
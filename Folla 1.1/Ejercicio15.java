import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = escaner.nextInt();
        if (num % 3 == 0) {
            System.out.println("Es multiplo de 3");
            escaner.close();
        }
        else {
            System.out.println("No es multiplo de 3");
            escaner.close();
        }
    }
}

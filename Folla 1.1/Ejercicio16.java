import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = escaner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par");
            escaner.close();
        }
        else {
            System.out.println("Es impar");
            escaner.close();
        }
    }
}

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo");
        double radio = escaner.nextInt();
        System.out.println("El area del círculo es "+(3.14159 * radio * radio));
        escaner.close();
    }
}

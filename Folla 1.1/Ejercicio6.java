import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1 = escaner.nextInt();
        System.out.println("El resto de dividir "+ num1 +" entre 2 es "+(num1 % 2));
        System.out.println("El resto de dividir "+ num1 +" entre 3 es "+(num1 % 3));
        escaner.close();
    }
}

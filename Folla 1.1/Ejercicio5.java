import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el dividendo");
        int num1 = escaner.nextInt();
        System.out.println("Introduce el divisor");
        int num2 = escaner.nextInt();
        System.out.println("El resto de dividir "+ num1 +" entre "+ num2 +" es "+(num1 % num2));
        escaner.close();
    }
}

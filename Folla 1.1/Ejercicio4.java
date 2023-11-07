import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = escaner.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = escaner.nextInt();
        System.out.println("Introduce el tercer número");
        int num3 = escaner.nextInt();
        System.out.println(num1 +" x "+ num2 +" x "+ num3 +" vale "+(num1 * num2 * num3));
        escaner.close();
    }
}

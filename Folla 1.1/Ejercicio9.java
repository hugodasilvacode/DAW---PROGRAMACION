import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la temperatura en ºF");
        double num1 = escaner.nextDouble();
        System.out.println(num1 +" ºF equivalen a "+ (num1 - 32) / 1.80 +" ºC.");
        escaner.close();
    }
}

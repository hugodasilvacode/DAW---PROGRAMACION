import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros");
        double num1 = escaner.nextDouble();
        System.out.println(num1 +" euros equivalen a "+(num1 * 1.07)+" dolares.");
        escaner.close();
    }
}

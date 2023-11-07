import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de dolares");
        double num1 = escaner.nextDouble();
        System.out.println(num1 +" dolares equivalen a "+(num1 / 1.07)+" euros.");
        escaner.close();
    }
}

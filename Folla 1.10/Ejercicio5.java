import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce el radio");
        double num1 = escaner.nextDouble();

        double resultado = area(num1);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static double area(double r) {
        return 3.14159 * Math.pow(r, 2);
    }

}
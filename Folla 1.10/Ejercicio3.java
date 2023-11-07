import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        double num1 = escaner.nextDouble();
        System.out.println("Introduce otro numero");
        double num2 = escaner.nextDouble();
        System.out.println("Introduce otro numero");
        double num3 = escaner.nextDouble();

        double resultado = suma3Double(num1,num2,num3);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static double suma3Double(double a, double b, double c) {
        return a + b + c;
    }

}
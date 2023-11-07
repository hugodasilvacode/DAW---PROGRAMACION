import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        double num1 = escaner.nextDouble();
        System.out.println("Introduce otro numero");
        double num2 = escaner.nextDouble();
        System.out.println("Introduce otro numero");
        double num3 = escaner.nextDouble();

        double resultado = media(num1,num2,num3);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static double media(double a, double b, double c) {
        return (a + b + c)/3.0;
    }

}
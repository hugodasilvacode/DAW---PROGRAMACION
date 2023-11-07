/*
 x3+ 2x2+ 3x +1
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero");
        double num1 = escaner.nextDouble();

        double resultado = poli(num1);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static double poli(double x) {
        return Math.pow(x, 3) + 2.0 * Math.pow(x, 2) + 3.0 * x + 1.0;
    }

}
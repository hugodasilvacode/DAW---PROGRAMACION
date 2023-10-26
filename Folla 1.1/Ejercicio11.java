/* Dada unha cantidade en €, mostrar a súa descomposición máis lóxica en billetes de 50 €, de 10€, de 5 €, e moedas de 1 €. */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros");
        int num = escaner.nextInt();
        int cincuenta = num / 50;
        int diez = (num - (cincuenta * 50)) / 10;
        int cinco = (num - (cincuenta * 50) - (diez * 10)) / 5;
        int uno = num - (cincuenta * 50) - (diez * 10) - (cinco * 5);
        System.out.println(num +" euros se pueden descomponer en "+ cincuenta +" billetes de 50, "+ diez +" billetes de 10, "+ cinco +" billetes de 5 y "+ uno +" monedas de 1.");
        escaner.close();
    }
}

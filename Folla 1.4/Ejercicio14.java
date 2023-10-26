/*
Programa que vaia pedindo repetidamente 3 números e os mostre ordeados. Despois de mostralos
preguntará se quere continuar, repetindo se o usuario contesta que ‘si’ á pregunta de se quere facelo de
novo.
*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equals("s")) {
            System.out.println("Introduce un numero entero positivo: ");
            int num1 = escaner.nextInt();
            System.out.println("Introduce un numero entero positivo: ");
            int num2 = escaner.nextInt();

            int min;
            int max;

            if (num1 < num2) {
                min = num1;
                max = num2;
            }
            else {
                min = num2;
                max = num1;
            }

            System.out.println("Introduce un numero entero positivo: ");
            int num3 = escaner.nextInt();

            int med;

            if (num3 < min) {
                med = min;
                min = num3;
            }
            else if (num3 > max) {
                med = max;
                max = num3;
            }
            else {
                med = num3;
            }
            System.out.println(min+","+med+","+max);
            System.out.println("\nQuiere continuar? (s/n) ");
            continuar = escaner.next();

        }
        escaner.close();
    }
}
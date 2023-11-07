/*
Programa que pida números e indique se son primos. O programa rematará se o número introducido é
negativo.
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int num = escaner.nextInt();

        while (num > 0) {
            Boolean c = true;
            if ((num % 2 == 0) && (num != 2)) {
                c = false;
            }
            for (int i = 3; i <= Math.sqrt(num); i+=2) {
                if ((num % i == 0) && (num != i)) {
                    c = false;
                    break;
                }
            }
            if (c) {
                System.out.println("Primo");
            }
            else {
                System.out.println("No primo");
            }
            System.out.println("\nIntroduce un numero entero positivo");
            num = escaner.nextInt();
        }
        escaner.close();
    }
}
/*
Programa que pida números e mostre se rematan en 0 ou en 5. Ao final deberá indicar o número de
números introducidos. O programa rematará se o número introducido é negativo.
*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int num = escaner.nextInt();

        int c = 0;

        while (num > 0) {
            if ((num % 5 == 0) || (num % 10 == 0)) {
                System.out.println("Acaba en 5 o 0");
            }
            c++;
            System.out.println("\nIntroduce un numero entero positivo");
            num = escaner.nextInt();
        }
        System.out.println(c);
        escaner.close();
    }
}
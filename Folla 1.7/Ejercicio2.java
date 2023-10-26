/*
Declara un array de 5 doubles e pídeos por teclado. Escribe na segunda posición o valor de último
elemento e mostra de novo todos os valores.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] arrayDouble = new double[5];

        for (int i=0; i<5; i++) {
            System.out.println("Introduce un numero double");
            arrayDouble[i] = escaner.nextDouble();
        }

        arrayDouble[1] = arrayDouble[4];

        for (double i : arrayDouble) {
            System.out.println(i);
        }

        escaner.close();
    }
}
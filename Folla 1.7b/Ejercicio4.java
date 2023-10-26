/*
Programa que pide 5 números, e mostra os que son maiores que o 2º introducido
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] array = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextDouble();
        }

        for (double i : array) {
            if (i > array[1]) {
                System.out.println(i);
            }
        }
        
        escaner.close();
    }
}
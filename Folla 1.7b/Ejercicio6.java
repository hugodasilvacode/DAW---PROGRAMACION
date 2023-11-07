/*
Programa que mostra os valores maiores que o 1º valor, e menores que o último, para un array de 6
elementos tipo float.
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] array = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextDouble();
        }

        for (double i : array) {
            if (i > array[0] && i < array[5]) {
                System.out.println(i);;
            }
        }
        
        escaner.close();
    }
}
/*
Cálculo do máximo e mínimo de 6 números introducidos por teclado. Primeiro introduciranse os
valores, e despois farase o cálculo. Deberase mostrar o máximo e o mínimo e o índice no que se
almacena cada un dos valores.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] array = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextDouble();
        }

        double min = array[0];
        double max = array[0];
        for (double i : array) {
            if (i > max) {
                max = i;
            }
            else if (i < min) {
                min = i;
            }
        }

        int index = 0;
        for (double i : array) {
            if (i == max) {
                System.out.println("El maximo es: "+i+", en el indice: "+index);
            }
            else if (i == min) {
                System.out.println("El minimo es: "+i+", en el indice: "+index);
            }
            index++;
        }
        
        escaner.close();
    }
}
/*
Dado un array de 6 floats, facer un programa que inverta ese array nun novo array, e mostre
finalmente os dous arrays.
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] array1 = new double[6];
        double [] array2 = new double[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero");
            array1[i] = escaner.nextDouble();
        }

        for (int i = 0; i < 6; i++) {
            array2[5-i] = array1[i];
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Array1["+i+"] = "+array1[i]+" ; Array2["+i+"] = "+array2[i]);
        }

        
        escaner.close();
    }
}
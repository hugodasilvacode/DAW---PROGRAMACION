/*
Declara un array a[5] de 5 enteiros. Declara outro array copia[5] de outros 5 elementos. Pide os
elementos de a[5] por teclado. Fai que todos os elementos do array copia sexan 1. Copia o 1º
elemento do array a[] no 1º elemento do array copia[]. Copia o 3º elemento do array a[] no 5º
elemento do array copia[]. Mostra o array copia[].
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] a = new int[5];
        int [] copia = new int[5];

        for (int i=0; i<5; i++) {
            System.out.println("Introduce un numero entero");
            a[i] = escaner.nextInt();
        }

        for (int i=0; i<5; i++) {
            copia[i] = 1;
        }

        copia[0] = a[0];
        copia[4] = a[2];

        for (int i : copia) {
            System.out.println(i);
        }

        escaner.close();
    }
}
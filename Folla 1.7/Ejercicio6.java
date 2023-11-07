/*
Declara un array de 3 enteiros. Pídeos por teclado. Escribe na primeira posición o valor gardado na
segunda posición, e na segunda posición o gardado na 3ª. Mostra o array. Volve pedir os valores
por teclado. Fai o que fixeches antes cun bucle. Mostra de novo o array.
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] arrayInt = new int[3];

        for (int i=0; i<3; i++) {
            System.out.println("Introduce un numero entero");
            arrayInt[i] = escaner.nextInt();
        }

        arrayInt[0] = arrayInt[1];
        arrayInt[1] = arrayInt[2];

        for (int i : arrayInt) {
            System.out.println(i);
        }

        for (int i=0; i<3; i++) {
            System.out.println("Introduce un numero entero");
            arrayInt[i] = escaner.nextInt();
        }

        for (int i=0; i<2; i++) {
            arrayInt[i] = arrayInt[i+1];
        }
        
        for (int i : arrayInt) {
            System.out.println(i);
        }

        escaner.close();
    }
}
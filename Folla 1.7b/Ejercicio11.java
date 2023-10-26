/*
Dado un array de 6 enteiros introducidos por teclado, borraremos o 3º valor, correndo os restantes
valores á posición anterior.
*/

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] array = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextInt();
        }

        for (int i = 2; i < 5; i++) {
            array[i] = array[i+1];
        }

        array[5] = 0;

        for (int i : array) {
            System.out.println(i);
        }

        escaner.close();
    }
}
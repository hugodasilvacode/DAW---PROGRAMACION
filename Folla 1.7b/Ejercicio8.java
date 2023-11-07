/*
Dado un array de 7 enteiros positivos e negativos, programa que modifique o array deixando en
cada índice o valor absoluto do introducido por teclado.
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] array = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            array[i] = Math.abs(array[i]);
        }

        for (int i : array) {
            System.out.println(i);
        }

        
        escaner.close();
    }
}
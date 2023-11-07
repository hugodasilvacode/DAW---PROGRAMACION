/*
Programa que inverta un array de 8 enteiros introducidos por teclado. O array deberá ser invertido
realmente en memoria, non é suficiente con mostralos ao revés.
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] array = new int[8];
        int a0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            a0 = array[7-i];
            array[7-i] = array[i];
            array[i] = a0;
            System.out.println(array[i]);
            System.out.println(array[7-i]+"\n"
            );
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(array[i]);
        }

        escaner.close();
    }
}
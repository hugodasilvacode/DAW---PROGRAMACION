/*
Declara un array de 8 enteiros. Pídeos por teclado. Móstraos. Cambia agora o último polo primeiro,
e o segundo polo penúltimo. Mostra todos os valores
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] arrayInt = new int[8];

        for (int i=0; i<8; i++) {
            System.out.println("Introduce un numero entero");
            arrayInt[i] = escaner.nextInt();
        }

        int a0 = arrayInt[0];
        int a1 = arrayInt[1];

        arrayInt[0] = arrayInt[7];
        arrayInt[7] = a0;
        arrayInt[1] = arrayInt[6];
        arrayInt[6] = a1;

        for (int i : arrayInt) {
            System.out.println(i);
        }

        escaner.close();
    }
}
/*
Programa que pida 10 números float por teclado. Logo mostraraos, mostrando ao final a media dos
10 números. Se a media coincide con algún dos números, indicaremos o índice no que se almacena
ese valor.
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] array = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            array[i] = escaner.nextDouble();
        }

        double media = 0;
        for (double i : array) {
            media += i;
            System.out.println(i);
        }
        media /= 10.0;
        System.out.println(media);

        int index = 0;
        for (double i : array) {
            if (media == i) {
                System.out.println(index);
            }
            index++;
        }
        
        escaner.close();
    }
}
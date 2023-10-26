/*
Programa que simule o lanzamento dun dado. O programa irá lanzando o dado e o xogador tentará
atinar cun único intento por cada lanzamento. Rematará cando acerte, e mostrará o número de veces
xogadas.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int n = 0;

        while (true) {
            double dadoFloat = (Math.random() * 6.0) + 1.0;
            int dado = (int) dadoFloat;

            System.out.println("\nQue saldrá en la tirada? (1,2,...,6)");
            int apuesta = escaner.nextInt();

            if (dado == apuesta) {
                System.out.println("Has acertado");
                System.out.println(n+" jugadas.");
                break;
            }
            else {
                System.out.println("No has aertado");
            }

            n++;
        }

        escaner.close();
    }
}
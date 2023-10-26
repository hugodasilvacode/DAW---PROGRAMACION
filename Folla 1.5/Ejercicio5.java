/*
Programa que pida números de 4 cifras e diga se son capicúas ou non. Rematará cando se introduzan
3 números que non son capicúas.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int n = 0;

        while (n < 3) {
            System.out.println("\nIntroduce un numero de 4 cifras");
            String numero = escaner.next();
            String numeroReverse = new StringBuilder(numero).reverse().toString();

            if (numero.equals(numeroReverse)) {
                System.out.println("Es capicua");
            }
            else {
                System.out.println("No es capicua");
                n++;
            }
        }

        escaner.close();
    }
}
/*
Programa que invirta un número de 4 cifras introducido por teclado.
*/

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero entero de 4 cifras");
        int num = escaner.nextInt();

        int c = 0;
        int rev = 0;

        for (int i = 10; i <= 10000; i *= 10) {
            int ud = ((num % i) - c) / (i/10);
            rev += ud * (10000/i);
        }
        System.out.println(rev);

        escaner.close();
    }
}
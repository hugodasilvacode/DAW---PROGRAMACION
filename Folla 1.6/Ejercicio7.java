/*
Facer un programa que amose en pantala os k primeiros números da serie de Fibonacci.
Esta á unha serie na que cada termo a partir do segundo se obtén sumando os dous
anteriores (1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...). Pide k por teclado e mostra os k primeiros
termos da serie.
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("k = ");
        int k = escaner.nextInt();
        long fib0 = 1;
        long fib1 = 1;
        long fib;

        System.out.println(fib0);
        System.out.println(fib1);

        for (int i = 3; i <= k; i++) {
            fib = fib1 + fib0;
            fib0 = fib1;
            fib1 = fib;

            System.out.println(fib);
        }
        escaner.close();
    }
}
/*
Programa que pida dous números n e m e mostre os números que hai entre eles indicando se son
pares ou impares co formato que se mostra a continuación. Se introducimos 2 e 5 sairá:
3.- impar
4.- par
*/

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("\nIntroduce un numero ");
        int n = escaner.nextInt();
        System.out.println("\nIntroduce otro numero ");
        int m = escaner.nextInt();

        for (int i = n + 1; i <= m - 1; i++) {
            if (i % 2 == 0) {
                System.out.println(i+".- par");
            }
            else {
                System.out.println(i+".- impar");
            }
        }

        escaner.close();
    }
}
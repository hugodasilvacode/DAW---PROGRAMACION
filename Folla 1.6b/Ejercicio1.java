/*
Programa que decida se un número enteiro é perfecto. Un número é perfecto se a suma dos seus divisores
distintos de si mesmo, contando o 1, é igual a número.
Por exemplo, o 6. (1+2+3 = 6)
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = escaner.nextInt();

        int sum = 0;

        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num == sum) {
            System.out.println("Es perfecto");
        }
        else {
            System.out.println("No es perfecto");
        }
        
        escaner.close();
    }
}
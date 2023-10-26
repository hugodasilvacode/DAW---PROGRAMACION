/*
Escribe un programa que decida se dous números enteiros positivos son amigos. Dous números son amigos
se a suma dos seus divisores distintos de si mismo de cada un deles coincide co outro número. Por exemplo,
284 e 220 son números amigos. O programa deberá ir pedindo números de 2 en 2 e decidindo se son amigos.
Os primeiros pares de números amigos son: (220, 284), (6232, 6368), (17.296, 18.416) e (9.363.584,
9.437.056). Fíxate que os números perfectos son amigos de si mesmos.
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = escaner.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= num1/2; i++) {
            if (num1 % i == 0) {
                sum1 += i;
            }
        }

        for (int i = 1; i <= num2/2; i++) {
            if (num2 % i == 0) {
                sum2 += i;
            }
        }

        if (num1 == sum2 && num2 == sum1) {
            System.out.println("Son amigos");
        }
        else {
            System.out.println("No son amigos");
        }
        
        escaner.close();
    }
}
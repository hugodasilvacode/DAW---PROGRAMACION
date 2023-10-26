/*
Fai un programa que faga o producto de 2 números enteiros introducidos por teclado empregando só a
operación suma.
*/

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero entero");
        int num2 = escaner.nextInt();

        int multip = num1;

        for (int i = 1; i < num2; i++) {
            multip += num1;
        }

        System.out.println(multip);

        escaner.close();
    }
}
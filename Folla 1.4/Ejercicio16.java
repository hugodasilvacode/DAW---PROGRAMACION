/*
Programa que calcule o factorial dun número introducido por teclado. O factorial é o producto do propio
número por todos os enteiros menores que el. Ex. Factorial de 5! = 5 * 4 * 3 * 2 = 120
*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        int num = escaner.nextInt();
        int numOriginal = num;

        for (int i = num - 1; i >= 2; i--) {
            num *= i;
        }

        System.out.println(numOriginal+"! = "+num);

        escaner.close();
    }
}
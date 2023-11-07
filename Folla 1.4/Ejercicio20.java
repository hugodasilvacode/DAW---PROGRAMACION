/*
Fai un programa que faga a división de 2 números enteiros introducidos por teclado empregando só a
operación resta.
*/

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero entero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero entero");
        int num2 = escaner.nextInt();

        int division = num1;
        int c = 0;

        while (division >= num2) {
            division -= num2;
            c += 1;
        }

        System.out.println(num1+" / "+num2+" = "+c);

        escaner.close();
    }
}
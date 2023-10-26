/*
Calcula o número de cifras que ten un enteiro introducido por teclado, empregando un bucle que vaia
dividindo por 10
*/

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo: ");
        int num = escaner.nextInt();

        int c = 0;

        while (num > 0) {
            num = num/10;
            c++;
        }
        System.out.println(c);

        escaner.close();
    }
}
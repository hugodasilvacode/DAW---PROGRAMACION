/*
Programa que vaia pedindo números con decimais polo teclado. Ao final, debe mostrar
cantos números introducidos foron negativos, cantos positivos, e a suma total de todos os
números. O programa rematará se se teclea o 1000 ou a suma dá 5.50
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double sum = 0;
        int cantNeg = 0;
        int cantPos = 0;

        while (true) {
            System.out.println("Introduce un numero");
            Double num = escaner.nextDouble();

            sum += num;

            if (num == 1000 || sum == 5.50) {
                break;
            }

            if (num < 0) {
                cantNeg += 1;
            }
            else {
                cantPos += 1;
            }

            System.out.println("Continuar? (s/n)");
            String cont = escaner.next();
            if (cont.equals("n")) {
                break;
            }
        }
        System.out.println("Cantidad negativos: "+cantNeg+" ; Cantidad positivos: "+cantPos+" ; Suma: "+sum);
        
        escaner.close();
    }
}
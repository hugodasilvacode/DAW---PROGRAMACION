/* Simula o xogo de lanzar 2 dados, dandolle ao xogador 3 intentos como máximo para achegarse ao 21.
Se chega xusto felicítao, e se non indicalle que perdeu. O xogador pode plantarse en calquer intento
anterior ao terceiro. */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int acumul = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Lanzar el dado? (s/n)");
            String lanzar = escaner.next();

            if (lanzar.equals("s")) {
                int dado1 = (int) (Math.random() * 6 + 1 );
                int dado2 = (int) (Math.random() * 6 + 1 );

                acumul += dado1 + dado2;

                System.out.println("Dado 1: "+ dado1 +" ; Dado 2: "+ dado2 +" ; Suma acumulada: "+ acumul);

            }
            else {
                break;
            }
        }
        
        if (acumul == 21) {
            System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }

        escaner.close();
    }
}
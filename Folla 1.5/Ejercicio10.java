/*
Simula o xogo de lanzar 1 dado, dándolle ao xogador o número de intentos que considere oportuno
para achegarse ao 21. Se chega xusto felicítao, e se non indícalle que perdeu. O xogador pode
plantarse en calquera intento.
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int n = 0;
        int sum = 0;

        while (n <= 5) {
            double dadoFloat = (Math.random() * 6.0) + 1.0;
            int dado = (int) dadoFloat;

            System.out.println("\nTirar? (s/n)");
            String tirar = escaner.next();

            if (tirar.equals("s")) {
                sum += dado;
                System.out.println("Dado: "+dado+" ; Acumulado: "+sum);
            }
            else {
                break;
            }

            n++;
        }

        if (sum == 21) {
            System.out.println("Has ganado");
        }
        else {
            System.out.println("Has perdido");
        }

        escaner.close();
    }
}
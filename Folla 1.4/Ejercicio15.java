/*
Programa que tire unha moeda ao aire tantas veces como queira o xogador, indicando se acerta ou
non. Ao final deberá mostrar cantos acertos houbo e o número de veces xogadas.
*/

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        String continuar = "s";
        int nAciertos = 0;
        int nJugadas = 0;

        while (continuar.equals("s")) {
            System.out.println("Cara o cruz?");
            String jugada = escaner.next();
            
            double monedaNum = Math.random();
            String monedaVal;
            if (monedaNum < 0.5) {
                monedaVal = "cara";
            }
            else {
                monedaVal = "cruz";
            }

            if (jugada.equals(monedaVal)) {
                System.out.println("Has acertado");
                nAciertos += 1;
            }
            else {
                System.out.println("No has acertado");
            }
            
            nJugadas += 1;

            System.out.println("\nQuiere continuar? (s/n) ");
            continuar = escaner.next();
        }

        System.out.println("Total jugadas: "+nJugadas+" ; Total aciertos: "+nAciertos);

        escaner.close();
    }
}
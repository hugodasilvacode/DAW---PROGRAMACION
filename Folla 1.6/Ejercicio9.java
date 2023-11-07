/*
Programa que simule o lanzamento de 2 dados, e mostre para 1000000 tiradas cantas
veces saíu o 3, cantas veces saíu o 7 e cantas o 10. Debe indicar tamén cal é o maior
destes 3 valores, e si pertence ao 3, ao 7 ou ao 10.
Por que o 7 é o que sae máis veces? Sae o 7 máis veces que calquera outro valor?
Compróbao modificando o programa para todos os números.
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int n = 0;

        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        int seis = 0;
        int siete = 0;
        int ocho = 0;
        int nueve = 0;
        int diez = 0;
        int once = 0;
        int doce = 0;

        while (n<=1000000) {
            double dadoFloat1 = (Math.random() * 6.0) + 1.0;
            int dado1 = (int) dadoFloat1;

            double dadoFloat2 = (Math.random() * 6.0) + 1.0;
            int dado2 = (int) dadoFloat2;

            int sum = dado1 + dado2;

            if (sum == 2) {dos += 1;}
            else if (sum == 3) {tres += 1;}
            else if (sum == 4) {cuatro += 1;}
            else if (sum == 5) {cinco += 1;}
            else if (sum == 6) {seis += 1;}
            else if (sum == 7) {siete += 1;}
            else if (sum == 8) {ocho += 1;}
            else if (sum == 9) {nueve += 1;}
            else if (sum == 10) {diez += 1;}
            else if (sum == 11) {once += 1;}
            else {doce += 1;}
            
            n++;
        }

        System.out.println("2: "+dos);
        System.out.println("3: "+tres);
        System.out.println("4: "+cuatro);
        System.out.println("5: "+cinco);
        System.out.println("6: "+seis);
        System.out.println("7: "+siete);
        System.out.println("8: "+ocho);
        System.out.println("9: "+nueve);
        System.out.println("10: "+diez);
        System.out.println("11: "+once);
        System.out.println("12: "+doce);

        escaner.close();
    }
}
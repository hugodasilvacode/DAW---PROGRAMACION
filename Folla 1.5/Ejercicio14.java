/*
Fai un programa para adiviñar un número entre 0 e 100, indicando se falla se o número era maior ou
menor. Conta o número de intentos, e móstrao ao final. Permite ao xogador plantarse se quere. 
*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int numA = (int) (Math.random() * 100);
        int num;
        int n = 0;

        while (true) {
            System.out.println("\nIntroduce un numero del 0 al 100");
            num = escaner.nextInt();
            
            if (num == numA) {
                System.out.println("Has ganado");
                break;
            }
            else {
                if (num < numA) {
                    System.out.println("Mayor");
                }
                else {
                    System.out.println("Menor");
                }
            }

            n++;

            System.out.println("\nQuires continuar? (s/n)");
            String cont = escaner.next();
            if (cont.equals("n")) {
                break;
            }
        }
        System.out.println("Numero de intentos: "+n);

        escaner.close();
    }
}
/*
Xogo de adiviñar un número entre 1 e 20. O xogador terá todos os intentos que queira, sendo
felicitado ao acertar, indicando cantos intentos lle levou. En cada fallo, o programa lle dirá se o
número a adiviñar é maior ou menor que o introducido. Poderá xogar as veces que queira. 
*/

import java.util.Scanner;

 public class Ejercicio6 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int adiv = (int) (Math.random() * 19 + 1);
        int c = 0;
 
        while (true) {
            System.out.println("Introduce un numero");
            int num = escaner.nextInt();
            c++;

            if (num == adiv) {
                System.out.println("Enhorabuena! Has acertado");
                System.out.println(c+" intentos");
                break;
            }
            else {
                if (num < adiv) {System.out.println("Mayor");}
                else {System.out.println("Menor");}
            }

        }

        escaner.close();
     }    
 }
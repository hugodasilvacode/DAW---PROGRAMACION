/*
Programa que vaia pedindo números repetidamente e mostra o máximo dos seus divisores
distintos del mesmo, e indique tamén se o número inicial é primo. Remata cando o número
introducido é o 0, ou cando o máximo dos divisores foi o 5.
*/

import java.util.Scanner;

 public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
 
        while (true) {
            System.out.println("Introduce un numero");
            int num = escaner.nextInt();

            int max = 1;
            boolean primo = true;

            if (num == 0) {
                break;
            }

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    max = i;
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("Maximo divisor: "+max+" ; "+num+" es primo");
            }
            else {
                System.out.println("Maximo divisor: "+max+" ; "+num+" no es primo");
            }

            if (max == 5) {
                break;
            }
        }
        escaner.close();
     }    
 }
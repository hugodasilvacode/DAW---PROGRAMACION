/*
Exercicio que pida a nota obtida nun traballo de 0 a 10, e mostre en función dos seus valores
“Suspenso”, “Aprobado”, “Notable” ou “Sobresaliente”.
*/

import java.util.Scanner;

 public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Nota obtenida en el trabajo");
        double nota = escaner.nextDouble();

        if (nota<5.0) {
            System.out.println("Suspenso");
        }
        else if (nota<7.0) {
            System.out.println("Aprobado");
        }
        else if (nota<9.0) {
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
        
        escaner.close();
     }    
 }
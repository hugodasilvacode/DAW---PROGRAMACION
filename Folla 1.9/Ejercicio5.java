/*
Programa que vaia pedindo números polo teclado. Ao final, debe mostrar cantos números
introducidos foron negativos, cantos positivos, e a suma total de todos os números. O
programa rematará se o número introducido foi o 1111 ou a suma dá 7. O 1111 non se contará
na suma, pero o 7 si.
*/

import java.util.Scanner;

 public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int sum = 0;
        int pos = 0;
        int neg = 0;
 
        while (true) {
            System.out.println("Introduce un numero");
            int num = escaner.nextInt();

            if (num == 1111) {
                break;
            }

            sum += num;
            
            if (num>0) {
                pos += 1;
            }
            else if (num<0) {
                neg += 1;
            }

            if (sum == 7) {
                break;
            }
        }
        System.out.println("Suma: "+sum+" ; positivos: "+pos+" ; negativos: "+neg);

        escaner.close();
     }    
 }
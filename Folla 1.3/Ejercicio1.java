/* Programa que pida por teclado un número menor que 10: emprega a función rand(10)
explicada na parte dereita desta folla. O xogador debe ter 3 posibilidades de acerto, indicando se
a súa tentativa foi maior ou menor, e mostrando unha mensaxe efusiva no caso de ter acertado.
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int numRandom = (int) (Math.random() * 10 + 1 );

        for (int i = 1; i <= 3; i++) {
            System.out.println("Elige un numero del 1 al 10");
            int num = escaner.nextInt();
            
            if (num == numRandom) {
                System.out.println("Has ganado!");
                break;
            }
            else {
                if (numRandom>num) {
                    System.out.println("Mayor");
                }
                else {
                    System.out.println("Menor");
                }
            }
        }

        escaner.close();
    }
}
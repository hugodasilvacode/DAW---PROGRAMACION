/* CONJETURA DE GOLDBACH */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = escaner.nextInt();

        for (int i = 2; i <= num-2; i++) {
            
            boolean iprimo = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    iprimo = false;
                    break;
                }
            }

            if (iprimo) {
                int otro = num - i;

                boolean otroprimo = true;

                for (int k = 2; k <= Math.sqrt(otro); k++) {
                    if (otro % k == 0) {
                        otroprimo = false;
                        break;
                    }
                }

                if (otroprimo) {
                    System.out.println(num+" = "+i+" + "+otro);
                }

            }
            
        } 
        escaner.close();
    }
}
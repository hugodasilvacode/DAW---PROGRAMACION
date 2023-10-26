/* FACTORES PRIMOS */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = escaner.nextInt();

        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num = num / i;
                count += 1;
            }
            if (count > 0) {
                System.out.println(i+"^"+count);
            }
        } 
        escaner.close();
    }
}
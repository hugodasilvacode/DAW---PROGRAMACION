/*
Programa que pida un número de 4, 5 ou 6 cifras, e o mostre por pantalla cunha coma na posición dos
miles: se poñemos 2345 mostrará 2,345; se introducimos 12000 mostrará 12,000 e se tecleamos 100000
mostrará 100,000.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero de 4, 5 o 6 cifras");
        int num = escaner.nextInt();
        
        if ((num>999) && (num<1000000)) {
            if (num%1000 == 0) {
                System.out.println(num/1000 +","+ "000" );
            }
            else {
                System.out.println(num/1000 +","+ num%1000 );
            }
        }

        escaner.close();
    }
}
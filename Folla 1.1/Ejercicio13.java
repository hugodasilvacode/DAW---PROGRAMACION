/* Mostra os miles, as centenas, decenas e unidades dun número de 4 cifras, empregando só divisións enteiras e operador resto % */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero de 4 cifras");
        int num = escaner.nextInt();
        if (num>999 && num<10000) {
            int miles = num / 1000;
            int centenas = (num - (miles * 1000)) / 100;
            int decenas = (num - (miles * 1000) - (centenas * 100)) / 10;
            int unidades = num - (miles * 1000) - (centenas * 100) - (decenas * 10);
            System.out.println(miles +" miles, "+ centenas +" centenas, "+ decenas +" decenas, "+ unidades +" unidades.");
            escaner.close();
        }
        else {
            System.out.println("El numero introducido no es de 4 cifras.");
            escaner.close();
        }
        
    }
}

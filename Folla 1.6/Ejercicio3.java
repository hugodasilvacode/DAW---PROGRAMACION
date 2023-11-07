/*
Fai un programa que cambie de € a dólares ( 1 euro son 1.06 dólares) ou de dólares a €
segundo queira o usuario. O programa preguntará que troco quere facer o usuario, farao e
logo preguntará se quere facer outro troco, rematando se o usuario non quere. O resultado
en euros terá 2 decimais. Podes empregar String.format do seguinte xeito:
System.out.println(String.format("Valor: %.2f", numeroDouble ));
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Quieres cambiar euros->$ (a) o de $->euros (b) ?");
            String cambio = escaner.next();
            System.out.println("Que cantidad quieres cambiar?");
            Double cant = escaner.nextDouble();

            if (cambio.equals("a")) {
                System.out.println(cant+" euros equivalen a "+ String.format("%.2f", cant * 1.06) +" $");
            }
            else if (cambio.equals("b")) {
                System.out.println(cant+" $ equivalen a "+ String.format("%.2f", cant / 1.06) +" euros");
            }
            else {
                System.out.println("Introduce 'a' para €->$ o 'b' para $->€");
            }

            System.out.println("Quieres realizar otro cambio? (s/n)");
            String cont = escaner.next();
            if (cont.equals("n")) {
                break;
            }
        }
        escaner.close();
    }
}
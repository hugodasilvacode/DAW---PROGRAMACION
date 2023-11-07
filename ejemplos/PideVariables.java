/* PIDO VARIABLE POR TECLADO Y MUESTRO SU VALOR */

import java.util.Scanner;

public class PideVariables {
    public static void main(String[] args) {
        System.out.println("Introduce un numero por teclado");
        Scanner escaner = new Scanner(System.in);
        int numero = escaner.nextInt();
        System.out.println("El numero tecleado es "+numero);
        int dobleNumero = numero * 2;
        System.out.println("El doble del numero es "+dobleNumero);

        escaner.close();
    }
}

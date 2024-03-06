/*
Queremos calcular o factorial dun número pero asegurándonos que o 
usuario introduce un enteiro por teclado. Ata que non introduza un 
enteiro pedirémoslle de novo o número. Faino primeiro coa clase 
Scanner e logo co JOptionPane. Investiga InputMismatchException 
e NumberFormatException, para cada un dos casos.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        
        Integer numero = null;

        boolean inputValido = false;

        Scanner escaner = new Scanner(System.in);

        while (!inputValido) {
            try {
                System.out.println("Introduce un numero entero");
                numero = escaner.nextInt();
                inputValido = true;
                escaner.close();
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Debe ser un número entero.");
                escaner.next();
            }
        }

        if (numero != null) {
            System.out.println(factorial(numero));
        } else {
            System.out.println("No se ha ingresado un número válido.");
        }

    }

    public static int factorial(int n) {
        if (n > 1) {
            n *= factorial(n-1);
        }
        return n;
    }
    
 }
/*
Dado un array de 10 elementos introducidos por teclado, programa que permite sucesivamente ao
usuario introducir un elemento, ou elixir o elemento a borrar. O programa rematará cando o usuario
queira parar, ou ben se encha de todo o array, ou ben non quede ningún elemento no array.
*/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] array = new int[10];

        while (true) {
            System.out.println("a) Introducir número.\nb) Borrar número.\nc) Parar");
            String res = escaner.next();

            if (res.equals("a")) {
                System.out.println("Introduce el índice");
                int index = escaner.nextInt();
                System.out.println("Introduce el valor");
                int value = escaner.nextInt();
                array[index] = value;
            }

            else if (res.equals("b")) {
                System.out.println("Introduce el índice");
                int index = escaner.nextInt();
                array[index] = 0;
            }
            
            else {
                break;
            }

            boolean lleno = true;
            boolean vacio = true;
            for (int i : array) {
                if (i == 0) {
                    lleno = false;
                }
                else {
                    vacio = false;
                }
            }
            if (lleno) {
                System.out.println("Array lleno");
                break;
            }
            else if (vacio) {
                System.out.println("Array vacio");
                break;
            }
        }
    
        escaner.close();
        
    }
}
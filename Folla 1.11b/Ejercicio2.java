/*
Fai un array de enteiros de 4 x 3. Fai unha función iniciaArray( ) que asigne en cada
posición o valor o producto da súa fila pola súa columna. Modifica a función
imprimeArray( ) do exercicio anterior para que imprima este array como unha matriz.
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [][] array = new int[4][3];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir valores.\nb) Mostrar valores.\nc) Salir.");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    iniciaArray(array);
                    break;
                case "b" :
                    imprimeArray(array);
                    break;
                case "c" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static void iniciaArray(int [][] a) {
        for (int i = 0; i<=a.length-1; i++) {
            for (int j = 0; j<=a[i].length-1; j++) {
                a[i][j] = i * j;
            }
        }
    }
    public static void imprimeArray(int [][] a) {
        for (int i = 0; i<=a.length-1; i++) {
            for (int j = 0; j<=a[i].length-1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
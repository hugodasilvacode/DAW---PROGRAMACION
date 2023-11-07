/*
Fai un programa que pida un array de enteiros de dimensións 2 x 2. Fai unha función
introArray( ) que pida os valores, e outra imprimeArray( ) que os mostre, como una
matriz 2 x 2.
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [][] array = new int[2][2];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir valores.\nb) Mostrar valores.\nc) Salir.");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    iniciaArray(array, escaner);
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
    public static void iniciaArray(int [][] a, Scanner escan) {
        for (int i = 0; i<=a.length-1; i++) {
            for (int j = 0; j<=a[i].length-1; j++) {
                System.out.println("Introduce el valor de la posicion "+i+","+j);
                a[i][j] = escan.nextInt();
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
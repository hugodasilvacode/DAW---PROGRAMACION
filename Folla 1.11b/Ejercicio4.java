import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [][] array1 = new int[2][2];
        int [][] array2 = new int[2][2];
        int [][] array3 = new int[2][2];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir valores.\nb) Multiplicar\nc) Mostrar valores.\nd) Salir.");   
            String opcion = escaner.next();
            String array;

            switch (opcion) {
                case "a" :
                    System.out.println("a) array A\nb) array B");   
                    array = escaner.next();
                    switch (array) {
                        case "a":
                            iniciaArray(array1,array1.length,array1[0].length,escaner);
                            break;
                    
                        case "b":
                            iniciaArray(array2,array2.length,array2[0].length,escaner);
                            break;
                    }
                    break;
                case "b" :
                    multiplica(array1,array2,array3);
                    break;
                case "c" :
                    System.out.println("a) array A\nb) array B\nc) array C");   
                    array = escaner.next();
                    switch (array) {
                        case "a":
                            imprimeArray(array1,array1.length,array1[0].length);
                            break;
                    
                        case "b":
                            imprimeArray(array2,array2.length,array2[0].length);
                            break;

                        case "c":
                            imprimeArray(array3,array3.length,array3[0].length);
                            break;
                    }
                    break;
                case "d" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static void iniciaArray(int [][] a ,int alto, int ancho, Scanner escan) {
        for (int i = 0; i<=alto-1; i++) {
            for (int j = 0; j<=ancho-1; j++) {
                System.out.println("Introduce el valor de la posicion "+i+","+j);
                a[i][j] = escan.nextInt();
            }
        }
    }
    public static void multiplica(int [][] a ,int [][] b, int [][] c) {
        for (int i = 0; i<=a.length-1; i++) {
            for (int j = 0; j<=a[i].length-1; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
    }
    public static void imprimeArray(int [][] a ,int alto, int ancho) {
        for (int i = 0; i<=alto-1; i++) {
            for (int j = 0; j<=ancho-1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
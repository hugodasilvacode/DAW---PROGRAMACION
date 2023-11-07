import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [][] array = new int[3][2];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir valores.\nb) Mostrar valores.\nc) Salir.");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    iniciaArray(array,array.length,array[0].length,escaner);
                    break;
                case "b" :
                    imprimeArray(array,array.length,array[0].length);
                    break;
                case "c" :
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
    public static void imprimeArray(int [][] a ,int alto, int ancho) {
        for (int i = 0; i<=alto-1; i++) {
            for (int j = 0; j<=ancho-1; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        double [] array = new double[4];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir valores.\nb) Mostrar valores.\nc) Salir.");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    introducir(array);
                    break;
                case "b" :
                    mostrar(array);
                    break;
                case "c" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static void introducir(double [] a) {
        Scanner escaner1 = new Scanner(System.in);
        for (int i = 0; i<=a.length-1; i++) {
            System.out.println("Introduce el valor de la posicion "+i);
            a[i] = escaner1.nextDouble();
        }
    }
    public static void mostrar(double [] a) {
        for (int i = 0; i<=a.length-1; i++) {
            System.out.println("El valor de la posicion "+i+" es "+a[i]);
        }
    }
}
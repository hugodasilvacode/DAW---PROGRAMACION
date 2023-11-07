import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [] array = new int[5];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir UN valor\nb) Borrar todos os valores\nc) Calcular a media dos valores\nd) Calcular o máximo dos valores\ne) Calcular o mínimo dos valores\nf) Mostrar valores\ng) Sair");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    introducir(array);
                    break;
                case "b" :
                    borrar(array);
                    break;
                case "c" :
                    media(array);
                    break;
                case "d" :
                    max(array);
                    break;
                case "e" :
                    min(array);
                    break;
                case "f" :
                    mostrar(array);
                    break;
                case "g" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static void introducir(int [] a) {
        Scanner escaner1 = new Scanner(System.in);
        for (int i = 0; i<=a.length-1; i++) {
            if (a[i] == 0) {
                System.out.println("Introduce el valor de la posicion "+i);
                a[i] = escaner1.nextInt();
                break;
            }
        }
    }
    public static void borrar(int [] a) {
        a = new int[5];
    }
    public static void media(int [] a) {
        int sum = 0;
        double lng = (double) a.length;
        for (int i = 0; i<=a.length-1; i++) {
            sum += a[i];
        }
        System.out.println(sum/lng);
    }
    public static void max(int [] a) {
        int max = a[0];
        for (int i = 1; i<=a.length-1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
    public static void min(int [] a) {
        int min = a[0];
        for (int i = 1; i<=a.length-1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
    public static void mostrar(int [] a) {
        for (int i = 0; i<=a.length-1; i++) {
            System.out.println("El valor en la posicion "+i+" es "+a[i]);
        }
    }
}
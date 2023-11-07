import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir 3 valores enteiros.\nb) Mostrar os 3 valores.\nc) Calcular a media. \nd) Calcular o maior dos 3 valores.\ne) Calcular o menor dos 3 valores.\nf) Salir.");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    System.out.println("Introduce un entero");
                    num1 = escaner.nextInt();
                    System.out.println("Introduce un entero");
                    num2 = escaner.nextInt();
                    System.out.println("Introduce un entero");
                    num3 = escaner.nextInt();
                    break;
                case "b" :
                    funcionB(num1,num2,num3);
                    break;
                case "c" :
                    System.out.println(media(num1,num2,num3));
                    break;
                case "d" :
                    System.out.println(max(num1,num2,num3));
                    break;
                case "e" :
                    System.out.println(min(num1,num2,num3));
                    break;
                case "f" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static void funcionB(int a, int b, int c) {
        System.out.println(a+", "+b+", "+c);
    }
    public static double media(int a, int b, int c) {
        return (a+b+c)/3.0;
    }
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static int min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
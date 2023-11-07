import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [] array1 = new int[6];
        int [] array2 = new int[6];

        for (int i = 0; i<=5; i++) {
            System.out.println("Introduce el valor de la posicion "+i+" del array 1");
            array1[i] = escaner.nextInt();
        }
        for (int i = 0; i<=5; i++) {
            System.out.println("Introduce el valor de la posicion "+i+" del array 2");
            array2[i] = escaner.nextInt();
        }

        compara(array1,array2);

        escaner.close();
    }
    public static void compara(int [] a, int [] b) {
        boolean igual = true;
        for (int i = 0; i<=a.length-1; i++) {
            if (a[i] > b [i]) {
                System.out.println(1);
                igual = false;
                break;
            }
            else if (a[i] < b [i]) {
                System.out.println(-1);
                igual = false;
                break;
            }
        }
        if (igual) {
            System.out.println(0);
        }
    }
}
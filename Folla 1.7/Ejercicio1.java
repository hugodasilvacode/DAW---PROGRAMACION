import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] arrayInt = new int[7];

        for (int i=0; i<7; i++) {
            System.out.println("Introduce un numero entero");
            arrayInt[i] = escaner.nextInt();
        }

        for (int i : arrayInt) {
            System.out.println(i);
        }

        escaner.close();
    }
}
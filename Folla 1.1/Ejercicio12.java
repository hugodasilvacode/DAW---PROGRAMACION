/* 12. Fai o intercambio do valor de 2 variables enteiras. Necesitarás unha variable auxiliar. */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la variable A");
        int numA = escaner.nextInt();
        System.out.println("Introduce la variable B");
        int numB = escaner.nextInt();
        
        int numC = numA;
        numA = numB;
        numB = numC;
        System.out.println("Ahora la variable A = "+ numA +" y la variable B = "+ numB);
        escaner.close();
    }
}

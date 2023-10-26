/* Facer a división de 2 números enteiros, amosando unha mensaxe de erro se o divisor é 0 (non
podemos facer a división por 0). */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero entero");
        int num2 = escaner.nextInt();
        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0");
            escaner.close();
        }
        else {
            System.out.println(num1 +" dividido entre "+ num2 +" es igual a "+ num1 / num2);
            escaner.close();
        }
    }
}

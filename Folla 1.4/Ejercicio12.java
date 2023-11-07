import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo: ");
        int num1 = escaner.nextInt();
        System.out.println("Introduce un numero entero positivo: ");
        int num2 = escaner.nextInt();

        int min;
        int max;

        int num;

        if (num1 < num2) {
            min = num1;
            max = num2;
        }
        else {
            min = num2;
            max = num1;
        }

        for (int i = 3; i <= 10; i++) {
            System.out.println("Introduce un numero entero positivo: ");
            num = escaner.nextInt();

            if (num < min) {
                min = num;
            }
            else if (num > max) {
                max = num;
            }
        }
        System.out.println("Minimo: "+min+" ; Maximo: "+max);

        escaner.close();
    }
}
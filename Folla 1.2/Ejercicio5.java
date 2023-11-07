import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = escaner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num2 +" es divisor de "+ num1);
        }
        else if (num2 % num1 == 0) {
            System.out.println(num1 +" es divisor de "+ num2);
        }
        else {
            System.out.println("Ninguno de los numeros es divisor del otro.");
        }

        escaner.close();
    }
}

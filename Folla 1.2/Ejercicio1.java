import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = escaner.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = escaner.nextInt();

        if (num1<num2) {
            if (num1<num3) {
                System.out.println("El menor numero es "+ num1);
            }
            else {
                System.out.println("El menor numero es "+ num3);
            }
        }
        else {
            if (num2<num3) {
                System.out.println("El menor numero es "+ num2);
            }
            else {
                System.out.println("El menor numero es "+ num3);
            }
        }

        escaner.close();
    }
}
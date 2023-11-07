import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = escaner.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = escaner.nextInt();

        int menor = num1;
        if (num2<menor) {
            menor = num2;
        }
        if (num3<menor) {
                menor = num3;
        }

        System.out.println("El menor numero es "+ menor);

        escaner.close();
    }
}

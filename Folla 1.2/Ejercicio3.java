import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = escaner.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = escaner.nextInt();
        System.out.println("Introduce el cuarto numero");
        int num4 = escaner.nextInt();
        System.out.println("Introduce el quinto numero");
        int num5 = escaner.nextInt();
        System.out.println("Introduce el sexto numero");
        int num6 = escaner.nextInt();

        int menor = num1;
        if (num2<menor) {
            menor = num2;
        }
        if (num3<menor) {
            menor = num3;
        }
        if (num4<menor) {
            menor = num4;
        }
        if (num5<menor) {
            menor = num5;
        }
        if (num6<menor) {
            menor = num6;
        }

        System.out.println("El menor numero es "+ menor);

        escaner.close();
    }
}

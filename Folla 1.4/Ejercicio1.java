import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = escaner.nextInt();
        System.out.println(num);

        while (num != 100) {
            System.out.println("Introduce un numero");
            num = escaner.nextInt();
            System.out.println(num);
        }

        escaner.close();
    }
}
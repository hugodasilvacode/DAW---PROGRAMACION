import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = escaner.nextInt();

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        escaner.close();
    }
}
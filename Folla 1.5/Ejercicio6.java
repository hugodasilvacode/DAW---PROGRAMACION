import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = escaner.nextInt();

        if (num2 < num1) {
            int num3 = num1;
            num1 = num2;
            num2 = num3;
        }
        
        for (int i = num1; i <= num2; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        escaner.close();
    }
}
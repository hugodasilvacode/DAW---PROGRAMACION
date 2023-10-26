import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int num = 1;
        int n = 0;
        
        while (num % 10 != 3) {
            System.out.println("\nIntroduce un numero");
            num = escaner.nextInt();
            
            if ((num % 10 == 0) || (num % 5 == 0)) {
                System.out.println("Termina en "+num % 10);
            }

            n++;
        }

        System.out.println("Has introducido "+n+" numeros.");

        escaner.close();
    }
}
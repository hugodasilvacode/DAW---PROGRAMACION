import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Que hora es? (0h - 24h)");
        int hora = escaner.nextInt();

        if (hora>7 && hora<14) {
            System.out.println("Buenos días");
        }
        else if (hora>14 && hora<22) {
            System.out.println("Buenas tardes");
        }
        else {
            System.out.println("Buenas noches");
        }
        
        escaner.close();
    }
}
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Hola! Quieres continuar? (s/n)");
        String num = escaner.next();

        while (num.equals("s")) {
            System.out.println("Hola! Quieres continuar? (s/n)");
            num = escaner.next();
        }

        escaner.close();
    }
}
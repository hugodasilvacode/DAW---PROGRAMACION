import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int ano = 0;

        while (ano != 3000) {
            System.out.println("Introduce un ano");
            ano = escaner.nextInt();

            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                System.out.println("Es bisiesto");
            }
            else {
                System.out.println("No es bisiesto");
            }
        }

        escaner.close();
    }
}
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un ano");
        int ano = escaner.nextInt();

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println("Es bisiesto");
        }
        else {
            System.out.println("No es bisiesto");
        }
        
        escaner.close();
    }
}

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero mayor que 5");
        int num = escaner.nextInt();
        if (num>5) {
            System.out.println("Correcto");
            escaner.close();
        }
        else {
            System.out.println("Incorrecto");
            escaner.close();
        }
    }
}

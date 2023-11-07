import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el numero mayor");
        int mayor = escaner.nextInt();
        System.out.println("Introduce el numero menor");
        int menor = escaner.nextInt();
        System.out.println("Su resta es "+(mayor - menor));
        escaner.close();
    }

}
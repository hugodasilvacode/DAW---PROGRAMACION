import java.util.Scanner;

public class AppString1_5 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        String palabra1 = escaner.nextLine();
        System.out.println("Escribe otra palabra");
        String palabra2 = escaner.nextLine();

        int valor = (int) Math.signum(palabra1.compareTo(palabra2));

        switch (valor) {
            case -1:
                System.out.println("La palabra "+palabra1+" va primero");
                break;
            case 0:
            System.out.println("Son iguales");
                break;
            case 1:
            System.out.println("La palabra "+palabra2+" va primero");
                break;
        }
        
        escaner.close();
    }
}
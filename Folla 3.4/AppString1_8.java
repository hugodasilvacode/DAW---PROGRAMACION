import java.util.Scanner;

public class AppString1_8 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = escaner.nextLine();

        int longitud = frase.length();

        String mitad1 = frase.substring(0, longitud/2);
        String mitad2 = frase.substring(longitud/2, longitud);

        System.out.println("'"+mitad2+mitad1+"'");
        
        escaner.close();
    }
}
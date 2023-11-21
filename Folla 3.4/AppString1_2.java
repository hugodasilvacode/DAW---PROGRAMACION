import java.util.Scanner;

public class AppString1_2 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        String frase;

        System.out.println("Escribe una frase");
        frase = escaner.nextLine();

        System.out.println(frase.indexOf("a"));

        escaner.close();
    }
}

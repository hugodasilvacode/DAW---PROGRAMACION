import java.util.Scanner;

public class AppString1_3 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        String frase;

        System.out.println("Escribe una frase");
        frase = escaner.nextLine();

        frase = frase.replace("a", "");

        System.out.println(frase);

        escaner.close();
    }
}

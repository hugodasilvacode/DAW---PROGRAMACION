import java.util.Scanner;

public class AppString1_9 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("Escribe una frase");
            String frase = escaner.nextLine();

            int longitud = frase.length();

            frase = frase.replaceAll("a", "-");
            frase = frase.replaceAll("e", "a");
            frase = frase.replaceAll("-", "e");

            System.out.println(frase);

            if (longitud == 2) {
                break;
            }
        }
        
        escaner.close();
    }
}
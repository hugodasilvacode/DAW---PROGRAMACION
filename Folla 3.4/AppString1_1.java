import java.util.Scanner;

public class AppString1_1 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        String frase;

        while (true) {
            System.out.println("Escribe una frase");
            frase = escaner.nextLine();

            if (frase.length()>15) {
                System.out.println(frase);
            }

            if (frase.equalsIgnoreCase("Fin")) {
                break;
            }
        }

        escaner.close();
    }
}

import java.util.Scanner;

public class AppString1_4 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        String frase;

        while (true) {
            System.out.println("Escribe una frase");
            frase = escaner.nextLine();

            String copia = frase.replace("a", "");

            System.out.println(copia);

            if (frase.equals(copia)) {
                break;
            }
        }

        escaner.close();
    }
}
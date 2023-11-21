import java.util.Scanner;

public class AppString1_11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
       
        System.out.println("Escribe una frase");
        String frase = escaner.nextLine();

        String fraseCopy = frase.replaceFirst(" ", "_");
        int index = fraseCopy.indexOf(" ");
        frase = frase.substring(0, index);

        System.out.println("'"+frase+"'");

        escaner.close();
    }
}
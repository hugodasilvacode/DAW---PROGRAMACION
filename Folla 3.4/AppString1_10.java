import java.util.Scanner;

public class AppString1_10 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("Escribe una frase");
            String frase = escaner.nextLine();
            System.out.println("Escribe el caracter a borrar");
            String letra = String.valueOf(escaner.nextLine().charAt(0));

            frase = frase.replaceAll(letra, "");

            System.out.println(frase);

            if (letra.equals(".")) {
                break;
            }
        }
        
        escaner.close();
    }
}
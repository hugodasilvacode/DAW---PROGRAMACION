import java.util.Scanner;

public class AppString1_13 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        
        System.out.println("Escribe una frase");
        String frase = escaner.nextLine();

        frase = String.valueOf(frase.charAt(0)).toUpperCase() + frase.substring(1);

        for (int i = 1; i <= frase.length(); i++) {
            if (String.valueOf(frase.charAt(i-1)).equals(" ")) {
                frase = frase.substring(0, i) + String.valueOf(frase.charAt(i)).toUpperCase() + frase.substring(i+1);
            }
        }

        System.out.println(frase);
        
        escaner.close();
    }
}
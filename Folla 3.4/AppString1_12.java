import java.util.Scanner;

public class AppString1_12 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("Escribe una frase");
            String frase = escaner.nextLine();

            int index = frase.indexOf("a");

            if (index == -1) {
                count = 0;
                System.out.println(frase);
            }
            else {
                count++;
                System.out.println(frase);
                System.out.println(frase);
                if (count == 3) {
                    break;
                }
            }
        }
        
        escaner.close();
    }
}
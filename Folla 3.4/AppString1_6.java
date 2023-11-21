import java.util.Scanner;

public class AppString1_6 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = escaner.nextLine();

        while (true) {
            int iPrimerHueco = frase.indexOf(" ");

            if (iPrimerHueco != -1) {
                int iMasHuecos = iPrimerHueco + 1;
                String huecos = " ";
                String siguiente;

                while (true) {
                    siguiente = String.valueOf(frase.charAt(iMasHuecos));

                    if (siguiente.equals(" ")) {
                        iMasHuecos++;
                        huecos += " ";
                    }
                    else {
                        break;
                    }
                }
                frase = frase.replaceFirst(huecos, "-");
            }
            else {
                break;
            }
        }
        frase = frase.replaceAll("-", " ");
        System.out.println(frase);

        escaner.close();
    }
}
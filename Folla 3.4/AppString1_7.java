import java.util.Scanner;

public class AppString1_7 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = escaner.nextLine();
        frase = frase.trim();

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
        int numPalabras = 1;
        
        while (true) {
            int iHueco = frase.indexOf(" ");

            if (iHueco != -1) {
                numPalabras += 1;
                frase = frase.replaceFirst(" ", "-");
            }
            else {
                break;
            }
        }

        System.out.println("Tiene "+numPalabras+" palabras");

        escaner.close();
    }
}
import java.util.Scanner;

public class AppString1_14 {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        String frase = "";
        boolean salir = false;

        while (true) {
            System.out.println("a) Introducir la frase\nb) Pasar las minusculas a mayusculas\nc) Borrar espacios\nd) Invertir la frase\ne) Escribir primera letra de cada palabra en mayuscula\nf) Mostrar la frase\ng) Salir\n");
            String opcion = escaner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce una frase");
                    frase = escaner.nextLine();
                    break;
                case "b":
                    frase = frase.toUpperCase();
                    break;
                case "c":
                    frase = frase.replaceAll(" ", "");
                    break;
                case "d":
                    String reverse = "";
                    for (int i = frase.length(); i >= 0; i--) {
                        reverse += frase.charAt(i);
                    }
                    frase = reverse;
                    break;
                case "e":
                    frase = String.valueOf(frase.charAt(0)).toUpperCase() + frase.substring(1);
                    for (int i = 1; i <= frase.length(); i++) {
                        if (String.valueOf(frase.charAt(i-1)).equals(" ")) {
                            frase = frase.substring(0, i) + String.valueOf(frase.charAt(i)).toUpperCase() + frase.substring(i+1);
                        }
                    }
                    break;
                case "f":
                    System.out.println(frase);
                    break;
                case "g":
                    salir = true;
                    break;
            }
            if (salir) {
                break;
            }
        }
        escaner.close();
    }
}
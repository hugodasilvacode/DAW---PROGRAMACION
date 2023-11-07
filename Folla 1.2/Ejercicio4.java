import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int premio = 0;

        System.out.println("Cual es tu nombre?");
        String nombre = escaner.nextLine();

        System.out.println("PRIMERA PREGUNTA:\n Cuanto suman los numeros del 1 al 10");
        int pregunta1 = escaner.nextInt();
        if (pregunta1 == 55) {
            System.out.println("Correcto!");
            premio += 500;
        }
        else {
            System.out.println("No es correcto! La respuesta es 55.");
        }

        System.out.println("SEGUNDA PREGUNTA:\n El padre de mi madre es mi ... ?");
        String pregunta2 = escaner.next();
        if (pregunta2.equals("abuelo")) {
            System.out.println("Correcto!");
            premio += 500;
        }
        else {
            System.out.println("No es correcto! La respuesta es 'abuelo'.");
        }

        System.out.println("TERCERA PREGUNTA:\n Cual es la capital de Alemania?");
        String pregunta3 = escaner.next();
        if (pregunta3.equals("Berlin")) {
            System.out.println("Correcto!");
            premio += 500;
        }
        else {
            System.out.println("No es correcto! La respuesta es 'Berlin'.");
        }
        
        System.out.println("Felicidades "+ nombre +", tu premio acumulado son "+ premio +" euros.");

        escaner.close();
    }
}

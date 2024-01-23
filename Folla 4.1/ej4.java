import javax.swing.JOptionPane;

/**
 * ej4
 */
public class ej4 {
    public static void main(String[] args) {
        
        String palabra;
        palabra = JOptionPane.showInputDialog("Introduce una letra:");
        Character letra = palabra.charAt(0);

        if (Character.isLetter(letra)) {
            System.out.println("Es una letra");
        }
        else {
            System.out.println("No es una letra");
        }

        if (Character.isUpperCase(letra)) {
            System.out.println("Es mayuscula");
        }
        else {
            System.out.println("Es minuscula");
        }

        if (Character.isDigit(letra)) {
            System.out.println("Es un numero");
        }
        else {
            System.out.println("No es un numero");
        }

    }
}
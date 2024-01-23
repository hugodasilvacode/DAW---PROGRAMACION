import javax.swing.JOptionPane;

public class ej5 {
    public static void main(String[] args) {

        String contrasinal;

        do {contrasinal = JOptionPane.showInputDialog("Introduce o contrasinal:");
        } while (!eValido(contrasinal));
        
    }

    public static boolean eValido(String contrasinal) {

        boolean mayuscula = false;
        boolean dixito = false;
        boolean caracterEspecial = false;

        for (int i=0; i<contrasinal.length(); i++) {
            Character letra = contrasinal.charAt(i);

            if (Character.isLetter(letra)) {
                if (Character.isUpperCase(letra)) {
                    mayuscula = true;
                }
            }
            
            else if (Character.isDigit(letra)) {
                dixito = true;
            }
            
            else {
                caracterEspecial = true;
            }
        }

        if (mayuscula && dixito && caracterEspecial) {
            return true;
        }
        else {
            System.out.println("Contrasinal non valido!");
            return false;
        }
    }
}
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (yyyy-MM-dd)");
        String fechaString = escaner.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fechaString);

        LocalDate fechaHoy = LocalDate.now();

        int diffAnos = fechaHoy.getYear() - fechaNacimiento.getYear();
        int diffDia  = fechaHoy.getDayOfYear() - fechaNacimiento.getDayOfYear();

        if (diffDia<0) {
            diffAnos -= 1;
        }

        System.out.println("Tienes "+ diffAnos +" años.");

        escaner.close();
    }
}

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el mes y el día de nacimiento (MM-dd)");
        String fechaString = escaner.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(LocalDate.now().getYear()+"-"+fechaString);

        LocalDate fechaHoy = LocalDate.now();

        int diffMes = fechaHoy.getMonthValue() - fechaNacimiento.getMonthValue();
        int diffDia = fechaHoy.getDayOfMonth() - fechaNacimiento.getDayOfMonth();

        if (diffDia<0) {
            diffMes -= 1;
            Month mesNombre = fechaNacimiento.getMonth();
            int mesDias = mesNombre.length(false);
            int dias = mesDias - fechaNacimiento.getDayOfMonth() + fechaHoy.getDayOfMonth();
            System.out.println("El bebé tiene "+ diffMes +" meses y "+ dias +" días.");
        }
        else {
            System.out.println("El bebé tiene "+ diffMes +" meses y "+ diffDia +" días.");
        }

        

        escaner.close();
    }
}

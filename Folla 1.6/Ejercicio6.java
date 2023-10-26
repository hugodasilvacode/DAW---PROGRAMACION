import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int dia;
        int mes;
        int ano;
        String fecha;

        do {
            do {
                System.out.println("Introduce el dia (entre 1 y 31)");
                dia = escaner.nextInt();
            } while (dia < 1 || dia > 31);

            do {
                System.out.println("Introduce el mes (entre 1 y 12)");
                mes = escaner.nextInt();
            } while (mes < 1 || mes > 12);

            do {
                System.out.println("Introduce el ano (entre 0 y 2020)");
                ano = escaner.nextInt();
            } while (ano < 0 || ano > 2023);

            fecha = String.format("%02d", dia)+"/"+String.format("%02d", mes)+"/"+String.format("%04d", ano);
            System.out.println(fecha);
        
        } while (!fecha.equals("04/10/2023"));

        escaner.close();
    }
}
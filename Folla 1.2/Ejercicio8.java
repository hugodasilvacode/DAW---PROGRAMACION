import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce las horas trabajadas esta semana");
        double horas = escaner.nextDouble();

        if (horas>40) {
            double extras = horas - 40.0;
            System.out.println("Esta semana cobrarás "+ (400.0+extras*16.50) +" euros.");
        }
        else {
            System.out.println("Esta semana cobrarás "+ (horas*10.0) +" euros.");
        }

        escaner.close();
    }
}

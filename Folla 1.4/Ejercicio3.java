import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = escaner.nextDouble();
        System.out.println("Introduce el segundo numero");
        Double num2 = escaner.nextDouble();

        while ((num1 != 100) && (num2 != 100)) {
            if (num2 != 0) {
                System.out.println(num1/num2);
            }
            else {
                System.out.println("No se puede dividir entre 0");
            }
            System.out.println("\nIntroduce el primer numero");
            num1 = escaner.nextDouble();
            System.out.println("Introduce el segundo numero");
            num2 = escaner.nextDouble();
        }

        escaner.close();
    }
}
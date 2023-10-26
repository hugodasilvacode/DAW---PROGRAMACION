import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        double [] array = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            array[i] = Math.pow(escaner.nextDouble(),2.0);
        }

        for (double i : array) {
            System.out.println(i);
        }
        
        escaner.close();
    }
}
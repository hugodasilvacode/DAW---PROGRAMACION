import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero");
        int num = escaner.nextInt();

        int resultado = sumDiv(num);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static int sumDiv(int n) {
        int sum = 0;

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
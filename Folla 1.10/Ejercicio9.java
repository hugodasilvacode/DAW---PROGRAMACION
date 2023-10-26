import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero");
        int num1 = escaner.nextInt();

        int resultado = sum1N(num1);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static int sum1N(int n) {
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

}
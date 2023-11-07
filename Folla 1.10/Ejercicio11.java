import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero entero");
        int num2 = escaner.nextInt();
        System.out.println("Introduce otro numero entero");
        int num3 = escaner.nextInt();

        int resultado = max(num1,num2,num3);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

}
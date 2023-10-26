import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero");
        int num1 = escaner.nextInt();
        System.out.println("Introduce otro numero entero");
        int num2 = escaner.nextInt();

        int resultado = suma(num1,num2);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static int suma(int a, int b) {
        return a + b;
    }

}
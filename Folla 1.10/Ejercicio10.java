import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero");
        String num1 = escaner.next();

        String resultado = reverse(num1);

        System.out.println(resultado);

        escaner.close();
        
    }
        
    public static String reverse(String n) {
        String numeroReverse = new StringBuilder(n).reverse().toString();
        return numeroReverse;
    }

}
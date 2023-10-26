import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo menor que 20");
        int num = escaner.nextInt();

        while (num != 0) {
            if (num>0 && num<20) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num+" x "+i+" = "+num*i);
                }
            }
            else {
                System.out.println("El numero no es un entero positivo menor que 20");
            }
            System.out.println("Introduce un numero entero positivo menor que 20");
            num = escaner.nextInt();
        }
        escaner.close();
    }
}
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero de 4 cifras");
        int num = escaner.nextInt();

        if (num>999 && num<10000) {
            int resto = num % 100;
            int cociente = num / 100;

            if (resto < 50) {
                System.out.println(cociente*100);
            }
            else {
                System.out.println((cociente + 1)*100);
            }
        }
        else {
            System.out.println("El numero no tiene 4 cifras");
        }
        
        escaner.close();
    }
}

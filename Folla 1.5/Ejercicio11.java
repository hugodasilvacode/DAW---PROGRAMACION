import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("\nCuantos numeros quieres introducir?");
        int nums = escaner.nextInt();

        int sum = 0;
        int max = 0;
        int num;

        for (int i = 1; i <= nums; i++) {
            System.out.println("\nIntroduce un numero");
            num = escaner.nextInt();
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Suma = "+sum+" ; Maximo = "+max);

        escaner.close();
    }
}
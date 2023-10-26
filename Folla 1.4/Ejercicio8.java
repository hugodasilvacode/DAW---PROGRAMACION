/*
Fai un programa que mostre a táboa de multiplicar dun número enteiro positivo menor que 20
introducido por teclado. Deberá comprobar que o número é positivo e menor que 20. A saída do
programa deberá ser (se se teclea o 2):
2 x 1 = 2
2 x 2 = 4
 ....
2 x 10 = 20
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce un numero entero positivo menor que 20");
        int num = escaner.nextInt();

        if (num>0 && num<20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num+" x "+i+" = "+num*i);
            }
        }
        else {
            System.out.println("El numero no es un entero positivo menor que 20");
        }

        escaner.close();
    }
}
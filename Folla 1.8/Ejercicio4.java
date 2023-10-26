/*
Fai un programa que mostre un menú como o seguinte:
a) Introducir 4 números enteiros.
b) Calcular o máximo e mostralo.
c) Calcular o mínimo e mostralo.
d) Calcular a media e mostrala.
e) Sair.
Nas opcións b), c), e d) debes comprobar que os números foron introducidos polo menos a primeira
vez. Emprega unha bandeira para iso
*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        boolean salir = false;
        boolean nums = false;
        int max = 0;
        int min = 0;

        while (true) {
            System.out.println("a) Introducir 4 números enteiros.\nb) Calcular o máximo e mostralo.\nc) Calcular o mínimo e mostralo.\nd) Calcular a media e mostrala.\ne) Salir.");
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    System.out.println("Introduce un entero");
                    num1 = escaner.nextInt();
                    max = num1;
                    min = num1;
                    System.out.println("Introduce un entero");
                    num2 = escaner.nextInt();
                    if (num2>max) {max = num2;}
                    else if (num2<min) {min = num2;}
                    System.out.println("Introduce un entero");
                    num3 = escaner.nextInt();
                    if (num3>max) {max = num3;}
                    else if (num4<min) {min = num3;}
                    System.out.println("Introduce un entero");
                    num4 = escaner.nextInt();
                    if (num4>max) {max = num4;}
                    else if (num4<min) {min = num4;}
                    nums = true;
                    break;
                case "b" :
                    if (nums) {
                        System.out.println(max);
                    }
                    else {
                        System.out.println("No has introducido los numeros");
                    }
                    break;
                case "c" :
                    if (nums) {
                        System.out.println(min);
                    }
                    else {
                        System.out.println("No has introducido los numeros");
                    }
                    break;
                case "d" :
                    if (nums) {
                        System.out.println((num1+num2+num3+num4)*0.25);
                    }
                    else {
                        System.out.println("No has introducido los numeros");
                    }
                    break;
                case "e" :
                    salir = true;
                    break;
            }
            if (salir) {
                break;
            }
        }
        escaner.close();
    }    
}
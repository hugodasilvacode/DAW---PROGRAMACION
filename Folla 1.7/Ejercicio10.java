/*
Declara un array de 12 doubles. Fai un menú para facer o seguinte:
a) Introducir os 12 números.
b) Mostrar os 12 números.
c) Pide unha posición e escribe nesa posición o valor 0
d) Pide unha posición e escribe nesa posición o valor introducido por teclado.
e) Intercambia os 2 primeiros valores do array.
f) Intercambia o 3º e o 4º valor do array.
g) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.
h) Sair.
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] arrayInt = new int[12];

        while (true) {
            System.out.println("a) Introducir os 12 números.\nb) Mostrar os 12 números.\nc) Pide unha posición e escribe nesa posición o valor 0\nd) Pide unha posición e escribe nesa posición o valor introducido por teclado.\ne) Intercambia os 2 primeiros valores do array.\nf) Intercambia o 3º e o 4º valor do array.\ng) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.\nh) Sair.");
            String res = escaner.next();

            if (res.equals("a")) {
                for (int i=0; i<12; i++) {
                    System.out.println("Introduce un numero entero");
                    arrayInt[i] = escaner.nextInt();
                }
            }
            else if (res.equals("b")) {
                for (int i : arrayInt) {
                    System.out.println(i);
                }
            }
            else if (res.equals("c")) {
                System.out.println("En que posicion quieres introducir 0?");
                int pos = escaner.nextInt();
                arrayInt[pos] = 0;
            }
            else if (res.equals("d")) {
                System.out.println("En que posicion quieres introducir 0?");
                int pos = escaner.nextInt();
                System.out.println("Que valor quieres introducir 0?");
                int val = escaner.nextInt();
                arrayInt[pos] = val;
            }
            else if (res.equals("e")) {
                int a0 = arrayInt[0]; 
                arrayInt[0] = arrayInt[1];
                arrayInt[1] = a0;
            }
            else if (res.equals("f")) {
                int a2 = arrayInt[2]; 
                arrayInt[2] = arrayInt[3];
                arrayInt[3] = a2;
            }
            else if (res.equals("g")) {
                for (int i = 0; i<12; i += 2) {
                    int a0 = arrayInt[i];
                    arrayInt[i] = arrayInt[i+1];
                    arrayInt[i+1] = a0;
                }
            }
            else {
                break;
            }
        }

        escaner.close();
    }
}
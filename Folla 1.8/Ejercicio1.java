/*
Fai un programa empregando switch no que se mostre o seguinte menú e faga o que se explica a
continuación ao pulsar esa letra:
a) Introducir un double
b) Imprimir o double
c) Sair
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        double num = 0;
        boolean salir = false;

        while (true) {
            System.out.println("a) Introducir un double\nb) Imprimir o double\nc) Sair");
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    System.out.println("Introduce un double");
                    num = escaner.nextDouble();
                    break;
                case "b" :
                    if (num == 0) {
                        System.out.println("no has introducido el numero");
                    }
                    else {
                        System.out.println(num);
                    }
                    break;
                case "c" :
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
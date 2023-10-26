/*
Mostra un menú como o seguinte:
a) Introducir un número enteiro
b) Mostrar o 25 % do número introducido (será double).
c) Mostrar o 35 % do número introducido (será double).
d) Mostrar o 50 % do número introducido (será double).
e) Sair
*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int num = 0;
        boolean salir = false;

        while (true) {
            System.out.println("a) Introducir un número enteiro\nb) Mostrar o 25 % do número introducido\nc) Mostrar o 35 % do número introducido\nd) Mostrar o 50 % do número introducido\ne) Salir");
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    System.out.println("Introduce un entero");
                    num = escaner.nextInt();
                    break;
                case "b" :
                    System.out.println(0.25*num);
                    break;
                case "c" :
                    System.out.println(0.35*num);
                    break;
                case "d" :
                    System.out.println(0.50*num);
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
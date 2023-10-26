/*
Xogo de adiviñar unha palabra entre 5 diferentes que empecen cada unha por unha vogal distinta.
O xogador terá 2 intentos para cada unha, sendo felicitado ao acertar, e informado da palabra no
caso de fallar. Poderá xogar as veces que queira. Emprega switch
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        String palabra = "";
        boolean salir = false;

        while (true) {
            System.out.println("a) Empieza por 'a'\nb) Empieza por 'b'\nc) Empieza por 'c'\nd) Empieza por 'd'\ne) Empieza por 'e'\nf) Salir");
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    for (int i=0; i<=1; i++) {
                        System.out.println("Adivina la palabra");
                        palabra = escaner.next();
                        if (palabra.equals("agua")) {
                            System.out.println("Enhorabuena! Es correcta");
                            break;
                        }
                        else {
                            System.out.println("No es correcta");
                        }
                    }
                    break;
                case "b" :
                    for (int i=0; i<=1; i++) {
                        System.out.println("Adivina la palabra");
                        palabra = escaner.next();
                        if (palabra.equals("burro")) {
                            System.out.println("Enhorabuena! Es correcta");
                            break;
                        }
                        else {
                            System.out.println("No es correcta");
                        }
                    }
                    break;
                case "c" :
                    for (int i=0; i<=1; i++) {
                        System.out.println("Adivina la palabra");
                        palabra = escaner.next();
                        if (palabra.equals("camello")) {
                            System.out.println("Enhorabuena! Es correcta");
                            break;
                        }
                        else {
                            System.out.println("No es correcta");
                        }
                    }
                    break;
                case "d" :
                    for (int i=0; i<=1; i++) {
                        System.out.println("Adivina la palabra");
                        palabra = escaner.next();
                        if (palabra.equals("dinamarca")) {
                            System.out.println("Enhorabuena! Es correcta");
                            break;
                        }
                        else {
                            System.out.println("No es correcta");
                        }
                    }
                    break;
                case "e" :
                    for (int i=0; i<=1; i++) {
                        System.out.println("Adivina la palabra");
                        palabra = escaner.next();
                        if (palabra.equals("elefante")) {
                            System.out.println("Enhorabuena! Es correcta");
                            break;
                        }
                        else {
                            System.out.println("No es correcta");
                        }
                    }
                    break;
                case "f" :
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
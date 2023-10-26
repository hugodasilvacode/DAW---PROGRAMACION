/*
Xogo de adiviñar unha palabra entre (a)'amigo', (o) 'ordenador' e (c)'casa'. O xogador terá
2 intentos para acertar, pulsando a letra inicial da palabra, recibindo unha felicitación no
caso de acerto e diráselle a palabra no caso de erro. Despois poderá xogar de novo se
quere, cambiando a palabra. Lembra que Math.random( ) dá un número que temos que
“transformar” na letra con sentencias if.
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        while (true) {
            System.out.println("\n(a)'amigo', (o) 'ordenador' o (c)'casa' ?");
            String jugada = escaner.next();
            int jugadaInt;

            if (jugada.equals("a")) {jugadaInt = 0;}
            else if (jugada.equals("o")) {jugadaInt = 1;}
            else {jugadaInt = 2;}
            
            int respuesta = (int) (Math.random() * 3);

            if (jugadaInt == respuesta) {
                System.out.println("Has ganado");
            }
            else {
                String res;
                if (respuesta == 0) {res = "'a' amigo";}
                else if (respuesta == 1) {res = "'o' ordenador";}
                else {res = "'c' casa";}

                System.out.println("Has perdido, la respuesta era "+res);
            }

            System.out.println("Quieres seguir jugando? (s/n)");
            String seguir = escaner.next();
            if (seguir.equals("n")) {break;}
        }
        escaner.close();
    }
}
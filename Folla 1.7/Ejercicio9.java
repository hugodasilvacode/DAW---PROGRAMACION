/*
Declara un array de 10 enteiros. Fai un menú para facer o seguinte:
a) Introducir os 10 números.
b) Mostrar os 10 números.
c) Poñer a 0 os 3 primeiros elementos do array.
d) Poñer a 10 os 3 últimos elementos do array.
e) Sair.
*/

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] arrayInt = new int[10];

        while (true) {
            System.out.println("a) Introducir os 10 números.\nb) Mostrar os 10 números.\nc) Poñer a 0 os 3 primeiros elementos do array.\nd) Poñer a 10 os 3 últimos elementos do array.\ne) Sair.");
            String res = escaner.next();

            if (res.equals("a")) {
                for (int i=0; i<10; i++) {
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
                for (int i=0; i<3; i++) {
                    arrayInt[i] = 0;
                }
            }
            else if (res.equals("d")) {
                for (int i=7; i<10; i++) {
                    arrayInt[i] = 10;
                }
            }
            else {
                break;
            }
        }

        escaner.close();
    }
}
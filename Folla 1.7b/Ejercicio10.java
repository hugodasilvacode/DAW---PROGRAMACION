/*
Programa que permita introducir ata 40 números enteiros nun array ata introducir o 0. Os elementos
non poden repetirse, así que con cada elemento introducido se comprobará que non existe, e se é
así , mostrarase unha mensaxe de aviso
*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int [] array = new int[40];
        int num;
        boolean check;

        for (int i = 0; i < 40; i++) {
            while (true) {
                check = false;
                System.out.println("Introduce un numero");
                num = escaner.nextInt();
            
                for (int j : array) {
                    if (num == j && j != 0) {
                        check = true;
                        break;
                    }
                }

                if (check == false) {
                    array[i] = num;
                    break;
                }

                else {
                    System.out.println("Numero repetido");
                }
            }
            if (num == 0) {
                break;
            }
        }

        escaner.close();
    }
}
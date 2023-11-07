/*
Programa que pida o alto (maior que 2) da figura e mostre con 'X' un rombo. Por exemplo, se o
alto é 5 a figura que sae por pantalla será:
  X
 XXX
XXXXX
 XXX
  X
 */

 import java.util.Scanner;

 public class Ejercicio7 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int alto;

        while (true) {
            System.out.println("Introduce el alto (numero impar mayor que 2)");
            alto = escaner.nextInt();

            if ((alto % 2 != 0) || (alto <= 2)) {
                break;
            }
            else {
                System.out.println("El numero tiene que ser impar mayor que 2");
            }
        }

        for (int i = 1; i < alto/2+1; i++) {
            String huecos = new String(new char[(alto/2+1-i)]).replace("\0", " ");
            String cruces = new String(new char[(2*i-1)]).replace("\0", "X");
            System.out.println(huecos+cruces+huecos);
        }
        for (int i = alto/2+1; i >= 1; i--) {
            String huecos = new String(new char[(alto/2+1-i)]).replace("\0", " ");
            String cruces = new String(new char[(2*i-1)]).replace("\0", "X");
            System.out.println(huecos+cruces+huecos);
        }

        escaner.close();
     }    
 }
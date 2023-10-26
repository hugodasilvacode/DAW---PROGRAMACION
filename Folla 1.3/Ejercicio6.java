/*
Mostra o custe de enviar unha carta por correo. Mostra a táboa que tes abaixo. Despois pide o peso
dunha carta e mostra o prezo final do envío.
• Ata 20 g 0.29 €
• Ata 50 g 0,41 €
• ata 100 g 0,66 €
• Ata 200 g 1,08 €
• Ata 350 g 1,91 €
*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("TABLA DE PRECIOS DE LAS CARTAS :");
        System.out.println("Ata 20 g 0.29 euros \nAta 50 g 0,41 euros \nAta 100 g 0,66 euros \nAta 200 g 1,08 euros \nAta 350 g 1,91 euros");

        System.out.println("Introduce el peso de tu carta");
        int num = escaner.nextInt();
        
        if (num<=20) {
            System.out.println(0.29);
        }
        else if (num<=50) {
            System.out.println(0.41);
        }
        else if (num<=100) {
            System.out.println(0.66);
        }
        else if (num<=200) {
            System.out.println(1.08);
        }
        else if (num<=350) {
            System.out.println(1.91);
        }
        else {
            System.out.println("La carta es demasiado pesada");
        }


        escaner.close();
    }
}
/*
Un comprador de material para unha empresa será preguntado polo material a comprar de
cada: 
paquetes de folios    3.00 €
caixas de bolígrafos  2.50 €
grapadoras           10.00 €
tóner de impresora   60.00 €
Finalmente, mostraremos o prezo a pagar, tendo en conta que se
éste supera os 1000.00 € o prezo será rebaixado nun 17.5 %, e se o prezo supera os 2000.00
€ a rebaixa será do 30 %. Mostra a cantidade a pagar, e a rebaixa.
*/

import java.util.Scanner;

 public class Ejercicio3 {
     public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        System.out.println("Cantidad de paquetes de folios");
        int pf = escaner.nextInt();
        System.out.println("Cantidad de caixas de boligrafos");
        int cb = escaner.nextInt();
        System.out.println("Cantidad de grapadoras");
        int gr = escaner.nextInt();
        System.out.println("Cantidad de toner de impresora");
        int ti = escaner.nextInt();

        double precio = pf * 3.0 + cb * 2.5 + gr * 10.0 + ti * 60.0;

        if ((precio>1000.0) && (precio<=2000.0)) {
            System.out.println("La cantidad a pagar es: "+precio * (1 - 0.175)+" ; la rebaja es: "+precio * 0.175);
        }
        else if (precio>2000.0) {
            System.out.println("La cantidad a pagar es: "+precio * (1 - 0.3)+" ; la rebaja es: "+precio * 0.3);
        }
        else {
            System.out.println("La cantidad a pagar es: "+precio+" ; la rebaja es: "+0.0);
        }
        
        escaner.close();
     }    
 }
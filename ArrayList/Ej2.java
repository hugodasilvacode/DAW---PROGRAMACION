/*
Fai unha lista para almacenar saúdos diferentes introducidos por teclado. 
O programa pedirá saúdos ata que se introduza “fin”. Entón o programa 
despedirase cun dos saúdos introducidos, elixido aleatoriamente.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ej2 {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        
        ArrayList<String> saludosList = new ArrayList<String>();

        System.out.println("Introduce un saludo");
        String saludo = escaner.nextLine();
        saludosList.add(saludo);

        while (!saludo.equals("fin")) {

            System.out.println("Introduce un saludo");
            saludo = escaner.nextLine();
            saludosList.add(saludo);
        }

        int indiceSaludo = ThreadLocalRandom.current().nextInt(0,saludosList.size());

        System.out.println(saludosList.get(indiceSaludo));
    }
}
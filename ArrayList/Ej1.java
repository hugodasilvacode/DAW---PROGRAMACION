/*
1.- Fai unha lista para gardar datos double, que corresponden a varias medidas 
dunha temperatura ambiente. O programa irá pedindo esas medidas ata que se introduce 100. 
Cando se introduce o 100, mostrarase a media das temperaturas medidas.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        
        ArrayList<Double> temperaturaList = new ArrayList<Double>();

        System.out.println("Introduce la temperatura");
        Double temperatura = escaner.nextDouble();
        temperaturaList.add(temperatura);

        while (temperatura != 100) {

            System.out.println("Introduce la temperatura");
            temperatura = escaner.nextDouble();
            temperaturaList.add(temperatura);
        }

        Double mediaTemperatura = 0.0;

        for (Double temp : temperaturaList) {
            mediaTemperatura += temp;
        }

        mediaTemperatura /= Double.valueOf(temperaturaList.size());

        System.out.println(mediaTemperatura);

    }
}
/*
Crea un array de 10 enteiros. Asigna os 10 primeiros pares como valores. 
Crea agora un arraList que sexa similar ao array creado.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Ej4 {
    public static void main(String[] args) {

        Integer[] intArray = new Integer[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 2*(i+1);
        }

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

        for (Integer integer : intList) {
            System.out.println(integer);
        }

    }
}
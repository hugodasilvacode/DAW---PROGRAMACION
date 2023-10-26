/*
Na empresa ProgSys, creada no 2015, os programadores comezan gañando 1200 € netos ao mes,
tendo un aumento anual do seu soldo dun 5 %. Pregunta o ano no que entrou un traballador, e indica o
soldo neto anual deste ano. (Un aumento anual do 5% do soldo quere dicir que o soldo do ano seguinte
vale soldoAnoPasado*1,05 ).
*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("En que ano empezaste a traballar?");
        int ano = escaner.nextInt();

        double sueldo = 1200;

        for (int i = ano + 1; i <= 2023; i++) {
            sueldo *= 1.05;
        }

        System.out.println("Sueldo neto de este ano: "+(sueldo * 12));

        escaner.close();
    }
}
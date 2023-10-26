/*
É moi frecuente nunha aplicación ter que validar os datos de entrada. Pedir unha data: día,
mes e ano, validando que os datos de entrada son correctos: o día debe estar entre 1 e 31,
o mes entre 1 e 12, e o ano entre 0 e 2020.
Se non son correctos, dar un erro e pedir de novo a entrada ata que ésta sexa correcta. Ao
final, mostrar a data con formato dia/mes/ano (dd/mm/aaaa). Emprega do_while para cada
un dos datos.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int dia;
        int mes;
        int ano;

        do {
            System.out.println("Introduce el dia (entre 1 y 31)");
            dia = escaner.nextInt();
        } while (dia < 1 || dia > 31);

        do {
            System.out.println("Introduce el mes (entre 1 y 12)");
            mes = escaner.nextInt();
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Introduce el ano (entre 0 y 2020)");
            ano = escaner.nextInt();
        } while (ano < 0 || ano > 2020);

        System.out.println(String.format("%02d", dia)+"/"+String.format("%02d", mes)+"/"+String.format("%04d", ano));

        escaner.close();
    }
}
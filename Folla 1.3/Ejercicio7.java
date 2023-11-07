/*
Pide por teclado un enteiro positivo num de 4 díxitos, e outro enteiro positivo d dun único díxito. Se d
aparece na representación dixital de num, mostra o número num cun signo de suma '+' debaixo de cada
aparición de d. No caso contrario, mostra unha mensaxe “d non aparece en num”.
Exemplo: 
Mostra un número de 4 cifras: 1100
Mostra un enteiro de 1 díxito: 0
1100
  ++
*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero de 4 cifras");
        String num = escaner.next();

        System.out.println("Introduce un numero de 1 cifra");
        String d = escaner.next();

        String cadena = "";
        
        if ((num.length() == 4) && (d.length() == 1)) {
            for (int i = 0; i <= 3; i++) {
                char ch = num.charAt(i);
                String c = String.valueOf(ch);
                if (d.equals(c)) {
                    cadena += "+";
                }
                else {
                    cadena += " ";
                }
            }
        }

        System.out.println(num+"\n"+cadena);

        escaner.close();
    }
}
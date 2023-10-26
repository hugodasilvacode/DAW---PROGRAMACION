/*
Fai un programa que mostre o seguinte menú e faga o que se explica a continuación ao pulsar esa
letra:
a) Introducir o número flotante.
b) Mostre a táboa de multiplicar ata 15 dese número. Emprega while.
c) Mostre a táboa de multiplicar ata 15 dese número, con 1 decimal.
d) Mostre a táboa de multiplicar ata 15 dese número, sen multiplicar polos múltiplos de 3. (non
multiplicará por 3, 6, 9, 12 e 15). Emprega continue.
e) Mostre a táboa de multiplicar dese número por 0.5 ata 7.5, de 0.5 en 0.5
f) Sair
Podemos empregar printf (print format) para mostrar un double ou float cun número de decimais.
No seguinte exemplo 7 será o ancho total do número, e 3 o número de decimais:
double numeroDouble = 1.23995888;
System.out.printf("%7.3f", numeroDouble);  MOSTRARÁ 1,24 
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        double num = 0;
        boolean salir = false;

        while (true) {
            System.out.println("a) Introducir o número flotante.\nb) Mostre a táboa de multiplicar ata 15 dese número.\nc) Mostre a táboa de multiplicar ata 15 dese número, con 1 decimal.\nd) Mostre a táboa de multiplicar ata 15 dese número, sen multiplicar polos múltiplos de 3.\ne) Mostre a táboa de multiplicar dese número por 0.5 ata 7.5, de 0.5 en 0.5\nf) Sair");
            String opcion = escaner.next();
            int mult = 1;
            double multd = 0.5;

            switch (opcion) {
                case "a" :
                    System.out.println("Introduce un double");
                    num = escaner.nextDouble();
                    break;
                case "b" :
                    while (mult<=15) {
                        System.out.println(num+" * "+mult+" = "+num*mult);
                        mult++;
                    }
                case "c" :
                    while (mult<=15) {
                        System.out.printf("%7.1f",num*mult);
                        System.out.println("");
                        mult++;
                    }
                    break;
                case "d" :
                    while (mult<=15) {
                        if (mult % 3 == 0) {
                            mult++;
                            continue;
                        }
                        System.out.println(num+" * "+mult+" = "+num*mult);
                        mult++;
                    }
                    break;
                case "e" :
                    while (multd<=7.5) {
                        System.out.println(num+" * "+multd+" = "+num*multd);
                        multd += 0.5;
                    }
                    break;
                case "f" :
                    salir = true;
                    break;
            }
            if (salir) {
                break;
            }
        }
        escaner.close();
    }    
}
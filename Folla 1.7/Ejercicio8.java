/*
Declara un array de 1200 enteiros. Fai que o primeiro valor sexa 5. Garda na segunda posición o
doble do que hai na primeira – 4. Garda na terceira posición o doble do que hai na segunda – 4. Fai
un bucle para facer isto ata a posición 1199. Mostra todos os valores do array.
*/

public class Ejercicio8 {
    public static void main(String[] args) {

        int [] arrayInt = new int[10];

        arrayInt[0] = 5;

        for (int i=1; i<10; i++) {
            arrayInt[i] = 2 * arrayInt[i-1] - 4;
        }

        for (int i : arrayInt) {
            System.out.println(i);
        }
    }
}

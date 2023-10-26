/*
Crea un array de 100 enteiros . Asígnalle desde o valor 1 ata 100. Mostrao como unha conta atrás.
Modifícao agora de xeito que en todas posicións na que hai un múltiplo de 5 se garde o valor 5.
Móstrao de novo como unha conta atrás
*/

public class Ejercicio7 {
    public static void main(String[] args) {

        int [] arrayInt = new int[100];

        for (int i=0; i<100; i++) {
            arrayInt[i] = i;
        }

        for (int i=99; i>=0; i--) {
            System.out.println(arrayInt[i]);
        }

        for (int i=0; i<100; i++) {
            if (arrayInt[i] % 5 == 0) {
                arrayInt[i] = 5;
            }
        }

        for (int i=99; i>=0; i--) {
            System.out.println(arrayInt[i]);
        }
    }
}

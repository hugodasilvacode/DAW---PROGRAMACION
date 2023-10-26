/*
Fai un array bidimensional de 2x3. En cada elemento se almacenará o produto do número da fila
polo número da columna correspondente.
*/

public class Ejercicio13 {
    public static void main(String[] args) {

        int [][] A = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 3; i++) {
                A[i][j] = i * j;
            }
        }
    }
}
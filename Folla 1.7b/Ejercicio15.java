/*
Fai un programa que, dada unha matriz, intercambie as súas filas polas súas columnas.
*/

public class Ejercicio15 {
    public static void main(String[] args) {

        int [][] A = new int[2][2];
        int [][] B = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = (int) (Math.random() * 9);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = A[j][i];
            }
        }

        System.out.println(A[0][0]+","+A[0][1]+"     "+B[0][0]+","+B[0][1]);
        System.out.println(A[1][0]+","+A[1][1]+" --> "+B[1][0]+","+B[1][1]);

    }
}
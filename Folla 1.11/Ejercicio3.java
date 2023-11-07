import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int [] array = new int[4];

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir todos os datos\nb) Borrar algún dos elementos.\nc) Imprimir o array\nd) Imprimir o array en xeito inverso\ne) Sair");
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    introducir(array);
                    break;
                case "b" :
                    borrar(array);
                    break;
                case "c" :
                    mostrar(array);
                    break;
                case "d" :
                    mostrarInv(array);
                    break;
                case "e" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static void introducir(int [] a) {
        Scanner escaner1 = new Scanner(System.in);
        for (int i = 0; i<=a.length-1; i++) {
            System.out.println("Introduce el valor de la posicion "+i);
            a[i] = escaner1.nextInt();
            }
    }
    
    public static void borrar(int [] a) {
        Scanner escaner2 = new Scanner(System.in);
        System.out.println("Introduce el indice del elemento a borrar");
        int indice = escaner2.nextInt();
        for (int i = 0; i<=a.length-1; i++) {
            if (i > indice) {
                a[i-1] = a[i];
            }
        }
        a[a.length-1] = 0;
    }
    public static void mostrar(int [] a) {
        for (int i = 0; i<=a.length-1; i++) {
            System.out.println("El valor en la posicion "+i+" es "+a[i]);
        }
    }
    public static void mostrarInv(int [] a) {
        for (int i = a.length-1; i>=0; i--) {
            System.out.println("El valor en la posicion "+i+" es "+a[i]);
        }
    }
}
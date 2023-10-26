import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio12_listas {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un numero entero positivo: ");
            num = escaner.nextInt();

            list.add(num);
        }

        System.out.println("Maximo: "+Collections.max(list));
        System.out.println("Minimo: "+Collections.min(list));

        escaner.close();
    }
}
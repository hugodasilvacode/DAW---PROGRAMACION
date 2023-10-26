import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce el numero de segundos");
        int sec = escaner.nextInt();
        int hor = sec / 3600;
        int min = (sec - (hor * 3600)) / 60;
        int secs = sec - (hor * 3600) - (min * 60);
        System.out.println(sec +" segundos equivalen a "+ hor +" horas, "+ min +" minutos y "+ secs +" segundos.");
        escaner.close();
    }
}

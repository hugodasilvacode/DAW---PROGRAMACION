import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = escaner.nextInt();

        if (num>999 && num<10000) {
            int unidades = (num - (num/10*10))*1000;
            int decenas = ((num/10*10) - (num/100*100))/10*100;
            int centenas = ((num/100*100) - (num/1000*1000))/100*10;
            int millares = ((num/1000*1000))/1000;
            System.out.println(unidades + decenas + centenas + millares);
        }
        else {
            System.out.println("El numero no tiene 4 cifras");
        }
        
        escaner.close();
    }
}
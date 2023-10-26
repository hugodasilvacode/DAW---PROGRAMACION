import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("\nIntroduce un numero de 4 cifras");
        int num = escaner.nextInt();
        
        int var = (num / 100) * 100;
        if ((num - var) < ((var + 100) - num)) {
            System.out.println(var);
        }
        else {
            System.out.println(var + 100);
        }
        
        while (true) {
            System.out.println("\nQuieres continuar? (s/n)");
            String cont = escaner.next();
            
            if (cont.equals("s")) {
                System.out.println("\nIntroduce un numero de 4 cifras");
                num = escaner.nextInt();
        
                var = (num / 100) * 100;
                if ((num - var) < ((var + 100) - num)) {
                    System.out.println(var);
                }
                else {
                    System.out.println(var + 100);
                }
            }
            else {
                break;
            }
        }
        escaner.close();
    }
}
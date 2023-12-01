import java.util.Scanner;

public class AppFraseBuilder {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        
        FraseBuilder fb = new FraseBuilder();

        boolean salir = false;

        while (true) {
            System.out.println("a) iniciaFrase\nb) eliminaFrase\nc) mostraFrase\nd) mostraLonxtudeCapacidade\ne) eliminaParte\nf) intoducirDouble\ng) invertirFrase\nh) sair");
            String opcion = escaner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce una frase");
                    fb.iniciaFrase(escaner.nextLine());
                    break;
                case "b":
                    fb.eliminaFrase();
                    break;
                case "c":
                    fb.mostraFrase();
                    break;
                case "d":
                    fb.mostraLonxitudeCapacidade();
                    break;
                case "e":
                    System.out.println("Introduce el primer indice");
                    int i = escaner.nextInt();
                    System.out.println("Introduce el segundo indice");
                    int j = escaner.nextInt();
                    fb.eliminaParte(i, j);
                    break;
                case "f":
                    System.out.println("Introduce el indice");
                    int k = escaner.nextInt();
                    System.out.println("Introduce el double");
                    double num = escaner.nextDouble();
                    fb.introducirDouble(k, num);
                    break;
                case "g":
                    fb.invertirFrase();
                    break;
                case "h":
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

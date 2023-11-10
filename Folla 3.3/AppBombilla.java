import java.util.Scanner;

public class AppBombilla {
    
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla(15);
        Bombilla bombilla3 = new Bombilla(6);

        bombilla1.setNome("bomb1");
        bombilla2.setNome("bomb2");
        bombilla3.setNome("bomb3");

        System.out.println(Bombilla.getPotenciaTotal());

        bombilla1.aumentaPotencia(5);
        bombilla2.aumentaPotencia(50);

        System.out.println(Bombilla.comparaBombilla(bombilla1, bombilla2));
        System.out.println(Bombilla.comparaBombilla(bombilla2, bombilla3));

        System.out.println(bombilla1.getPotencia());
        System.out.println(bombilla2.getPotencia());
        System.out.println(bombilla3.getPotencia());

        System.out.println(Bombilla.getPotenciaTotal());

        System.out.println("Watios a bajar de bombilla2");
        bombilla2.baixaPotencia(escaner.nextInt());
        System.out.println("Watios a bajar de bombilla3");
        bombilla3.baixaPotencia(escaner.nextInt());

        System.out.println(bombilla1.getPotencia());
        System.out.println(bombilla2.getPotencia());
        System.out.println(bombilla3.getPotencia());

        System.out.println(Bombilla.getPotenciaTotal());

        System.out.println(Bombilla.comparaBombilla(bombilla1, bombilla2));
        System.out.println(Bombilla.comparaBombilla(bombilla2, bombilla3));

        bombilla1.setPotencia(0);
        bombilla2.setPotencia(0);
        bombilla3.setPotencia(0);

        System.out.println(bombilla1.getPotencia());
        System.out.println(bombilla2.getPotencia());
        System.out.println(bombilla3.getPotencia());

        System.out.println(Bombilla.getPotenciaTotal());

        System.out.println(Bombilla.comparaBombilla(bombilla1, bombilla2));
        System.out.println(Bombilla.comparaBombilla(bombilla2, bombilla3));

        System.out.println("FIN");


        
    }
}

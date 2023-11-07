public class AppBombilla {
    
    public static void main(String[] args) {
        
        Bombilla bombilla = new Bombilla(0);

        System.out.println(bombilla.getPotencia());

        bombilla.setPotencia(30);

        System.out.println(bombilla.getPotencia());

        bombilla.aumentaPotencia(20);

        System.out.println(bombilla.getPotencia());

        bombilla.baixaPotencia(10);

        System.out.println(bombilla.getPotencia());

        bombilla.aumentaPotencia(5);

        System.out.println(bombilla.getPotencia());

        bombilla.setPotencia(10);

        System.out.println(bombilla.getPotencia());

        bombilla.baixaPotencia(20);

        System.out.println(bombilla.getPotencia());
    }
}

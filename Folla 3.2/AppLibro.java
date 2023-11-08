public class AppLibro {

    public static void main (String[] args) {

        Libro libro1 = new Libro("Quijote","Cervantes",30.0,25);
        Libro libro2 = new Libro("Los origenes de mal","Harry Quevert",10.50,2);
        Libro libro3 = new Libro("Juego de tronos","George Martin",25.0,5);
        
        Libro libro4 = new Libro("Quijote","Cervantes",30.0,26);

        libro2.setPrezo(12.50);

        libro1.seVende();
        libro3.seVende();
        System.out.println(Libro.numLibrosVendidos);

        System.out.println(Libro.valeMais(libro1,libro2));
        System.out.println(Libro.valeMais(libro2,libro1));
        System.out.println(Libro.valeMais(libro1,libro4));
    }
}
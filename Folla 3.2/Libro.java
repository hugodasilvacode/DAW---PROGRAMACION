public class Libro {

    private String titulo;
    private String autor;
    private double prezo;
    private int exemplar;
    private boolean vendido;

    public static int numLibrosVendidos;

    public Libro(String titulo, String autor, double prezo, int exemplar) {
        this.titulo = titulo;
        this.autor = autor;
        this.prezo = prezo;
        this.exemplar = exemplar;
        this.vendido = false;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getPrezo() {
        return this.prezo;
    }

    public int getExemplar() {
        return this.exemplar;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public void setExemplar(int exemplar) {
        this.exemplar = exemplar;
    }

    public void seVende() {
        this.vendido = true;
        numLibrosVendidos++;
    }

    public static int valeMais(Libro libro1, Libro libro2) {
        if (libro1.getPrezo()>libro2.getPrezo()) {
            return -1;
        }
        else if (libro2.getPrezo()>libro1.getPrezo()) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
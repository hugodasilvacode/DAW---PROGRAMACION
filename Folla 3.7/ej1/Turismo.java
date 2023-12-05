
public class Turismo extends Vehiculo{

    private Double precioKm;
    private int kmAlquiler;
    private int kmDevolucion;

    public static int numTurismos;
    public static int numTurAlquilados;
    
    public Turismo(String matricula, Boolean alquilado, Double precioKm, int kmAlquiler) {
        super(matricula, alquilado);
        this.precioKm = precioKm;
        this.kmAlquiler = kmAlquiler;
        this.kmDevolucion = kmAlquiler;
        numTurismos++;
    }

    public Turismo() {
        super();
        this.precioKm = 0.3;
        this.kmAlquiler = 0;
        this.kmDevolucion = 0;
        numTurismos++;
    }

    public Double getPrecioKm() {
        return precioKm;
    }
    public void setPrecioKm(Double precioKm) {
        this.precioKm = precioKm;
    }
    public int getKmAlquiler() {
        return kmAlquiler;
    }
    public void setKmAlquiler(int kmAlquiler) {
        this.kmAlquiler = kmAlquiler;
    }
    public int getKmDevolucion() {
        return kmDevolucion;
    }
    public void setKmDevolucion(int kmDevolucion) {
        this.kmDevolucion = kmDevolucion;
    }
    public static int getNumTurismos() {
        return numTurismos;
    }
    public static int getNumTurAlquilados() {
        return numTurAlquilados;
    }
    
    public void alugar() {
        if (isAlquilado()) {
            System.out.println("Este turismo ya está alquilado");
        }
        else {
            numTurAlquilados++;
            System.out.println("Ha alquilado el turismo. Km: " + kmAlquiler);
        }
    }

    public void devolver(int kmDevolucion) {
        if (isAlquilado()) {
            this.setKmDevolucion(kmDevolucion);
            double prezoPagar = precioKm * (kmDevolucion - kmAlquiler);
            System.out.println("Ten que pagar "+prezoPagar+" euros.");
            numTurAlquilados--;
            this.setAlquilado(false);
        }
        else {
            System.out.println("No puede devolver un coche que no ha alquilado");
        }
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return superString + ", precioKm=" + precioKm + ", kmAlquiler=" + kmAlquiler + ", kmDevolucion=" + kmDevolucion;
    }

}
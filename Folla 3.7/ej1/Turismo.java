
public class Turismo extends Vehiculo{

    private Double precioKm;
    private int kmAlquiler;
    private int kmDevolucion;

    public static int numTurismos;
    public static int numTurAlquilados;
    
    public Turismo(String matricula, Boolean alquilado, Double precioKm, int kmAlquiler, int kmDevolucion) {
        super(matricula, alquilado);
        this.precioKm = precioKm;
        this.kmAlquiler = kmAlquiler;
        this.kmDevolucion = kmDevolucion;
    }

    public Turismo() {
        super();
        this.precioKm = 0.3;
        this.kmAlquiler = 0;
        this.kmDevolucion = 0;
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
    
    public void alugar() {
        if (isAlquilado()) {
            System.out.println("Este turismo ya está alquilado");
        }
        else {
            System.out.println("Ha alquilado el turismo. Km: " + kmAlquiler);
        }
    }

    


}
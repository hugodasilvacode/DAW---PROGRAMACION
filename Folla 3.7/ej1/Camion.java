public class Camion extends Vehiculo {
    
    private double precioDia;
    private int diaInicio;
    private int diaFinal;
    
    public static int numCamiones;
    public static int numCamionesAlquilados;

    public Camion(String matricula, Boolean alquilado, double precioDia, int diaInicio, int diaFinal) {
        super(matricula, alquilado);
        this.precioDia = precioDia;
        this.diaInicio = diaInicio;
        this.diaFinal = diaFinal;
    }

    
}
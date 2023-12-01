package ej3;
public class PlanetaHabitable extends Planeta {
    
    private int numPersoas;
    private Double tempMax;
    private Double tempMin;

    public PlanetaHabitable(String nome, Double tamano, Double distancia, int numPersoas, Double tempMax, Double tempMin) {
        super(nome, tamano, distancia);
        this.numPersoas = numPersoas;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public PlanetaHabitable() {
        super();
        this.numPersoas = 1;
        this.tempMax = 50.0;
        this.tempMin = -50.0;
    }

    public int getNumPersoas() {
        return numPersoas;
    }

    public void setNumPersoas(int numPersoas) {
        this.numPersoas = numPersoas;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    @Override
    public String toString() {
        String superPlaneta = super.toString();
        return superPlaneta + ", numPersoas= " + numPersoas + ", tempMax= " + tempMax + ", tempMin= " + tempMin;
    }

    


}

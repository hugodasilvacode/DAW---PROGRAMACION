package ej3;

public class Planeta {
    
    private boolean accesible;
    private String nome;
    private Double tamano;
    private Double distancia;

    public static int numPlanetasAccesibles = 0;

    public Planeta(String nome, Double tamano, Double distancia) {
        this.accesible = true;
        this.nome = nome;
        this.tamano = tamano;
        this.distancia = distancia;
        numPlanetasAccesibles++;
    }
    
    public Planeta() {
        this.accesible = true;
        this.nome = "senNome";
        this.tamano = 1.0;
        this.distancia = 100.0;
        numPlanetasAccesibles++;
    }

    public String getNome() {
        return nome;
    }
    public Double getTamano() {
        return tamano;
    }
    public Double getDistancia() {
        return distancia;
    }
    public boolean isAccesible() {
        return accesible;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }
    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
    public void setAccesible(boolean accesible) {
        this.accesible = accesible;
    }
    public void explotou() {
        this.accesible = false;
        numPlanetasAccesibles--;
    }

    @Override
    public String toString() {
        return "accesible= " + accesible + ", nome= " + nome + ", tamano= " + tamano + " soles, distancia= " + distancia + " ly";
    }
    
    

}

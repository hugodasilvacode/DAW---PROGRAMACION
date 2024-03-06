package Ej3;

public abstract class Vehiculo {

    private int velocidadeActual;
    private int velocidadeMaxima;

    public Vehiculo(int velocidadeActual, int velocidadeMaxima) {
        this.velocidadeActual = velocidadeActual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeActual() {
        return velocidadeActual;
    }

    public void setVelocidadeActual(int velocidadeActual) {
        this.velocidadeActual = velocidadeActual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    abstract void acelerar(int incrementoVelocidade);

    abstract void frear(int disminucionVelocidade);

    public void imprimir() {
        System.out.println("Velocidade actual: " + this.velocidadeActual);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima + "\n");
    }


}
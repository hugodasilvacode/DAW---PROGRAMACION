package Ej3;

public class Terrestre extends Vehiculo implements Motor {

    private int cantidadeRodas;
    private String uso;

    public Terrestre(int velocidadeActual, int velocidadeMaxima, int cantidadeRodas, String uso) {
        super(velocidadeActual, velocidadeMaxima);
        this.cantidadeRodas = cantidadeRodas;
        this.uso = uso;
    }

    public int getCantidadeRodas() {
        return cantidadeRodas;
    }

    public void setCantidadeRodas(int cantidadeRodas) {
        this.cantidadeRodas = cantidadeRodas;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    void acelerar(int incrementoVelocidade) {
        int novaVelocidade = this.getVelocidadeActual() + incrementoVelocidade;

        if (novaVelocidade <= this.getVelocidadeMaxima()) {
            this.setVelocidadeActual(novaVelocidade);
        }
        
        else {
            this.setVelocidadeActual(this.getVelocidadeMaxima());
        }
    }

    @Override
    void frear(int disminucionVelocidade) {
        int novaVelocidade = this.getVelocidadeActual() - disminucionVelocidade;

        if (novaVelocidade >= 0) {
            this.setVelocidadeActual(novaVelocidade);
        }

        else {
            this.setVelocidadeActual(0);
        }
    }

    @Override
    public int calculaRevolucionsMotor(int forza, int radio) {
        return forza * radio;
    }

}
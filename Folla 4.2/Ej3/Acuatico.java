package Ej3;

public class Acuatico extends Vehiculo implements Motor, Vela {

    private String tipo;
    private int capacidadeViaxeiros;

    public Acuatico(int velocidadeActual, int velocidadeMaxima, String tipo, int capacidadeViaxeiros) {
        super(velocidadeActual, velocidadeMaxima);
        this.tipo = tipo;
        this.capacidadeViaxeiros = capacidadeViaxeiros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadeViaxeiros() {
        return capacidadeViaxeiros;
    }

    public void setCapacidadeViaxeiros(int capacidadeViaxeiros) {
        this.capacidadeViaxeiros = capacidadeViaxeiros;
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


    @Override
    public void recomendarVelocidade(int velocidadeVento) {
        if (velocidadeVento > 60 || velocidadeVento < 10) {
            System.out.println("Non se recomenda sair");
            setVelocidadeActual(0);
        }
    }
    
}
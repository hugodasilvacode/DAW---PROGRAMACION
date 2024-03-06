class Procesador{
    private String modelo;
    private double velocidade;

    Procesador(String modelo, double velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
} 

class DiscoDuro {
    private double capacidade;
    private String tipo;
    private int velocidade;
    DiscoDuro(double capacidade, String tipo, int velocidade){
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.velocidade = velocidade;
        
  }
}

class Memoria{
    static final int MIN_MEM=2;
    private int capacidade;
    private String tipo;
    private int velocidade;
    Memoria(int capacidade, String tipo, int velocidade){
        if(capacidade < MIN_MEM){
          this.capacidade = MIN_MEM;
        } else {
          this.capacidade = capacidade; 
        }
        this.tipo = tipo;
        this.velocidade = velocidade;
    }
    int getCapacidade(){
        return capacidade;
    }
}
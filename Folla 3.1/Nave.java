public class Nave {

    private String nome = "Nostromo";
    private int tempo;

    public Nave() {
        this.tempo = 10;
    }

    public int getTempo() {
        return this.tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getNome() {
        return this.nome;
    }
}
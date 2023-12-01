package ej1;
public class Xogador extends Participante{
    
    private String posto;

    public Xogador(String nome, int idade, String posto) {
        super(nome, idade);
        this.posto = posto;
    }

    public Xogador() {
        super();
        this.posto = "-";
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }
}

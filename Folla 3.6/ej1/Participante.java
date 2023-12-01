package ej1;
/**
 * Participante
 */
public class Participante {

    private String nome;
    private int idade;

    public Participante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Participante() {
        this.nome = "-";
        this.idade = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
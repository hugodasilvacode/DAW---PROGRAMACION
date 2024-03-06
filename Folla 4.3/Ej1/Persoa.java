package Ej1;

public abstract class Persoa {

    private String nome;
    private String apelidos;
    private int idade;

    public Persoa(String nome, String apelidos, int idade) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    abstract void dameDescricion();
}
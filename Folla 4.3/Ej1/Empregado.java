package Ej1;

public class Empregado extends Persoa{

    private int soldo;

    public Empregado(String nome, String apelidos, int idade, int soldo) {
        super(nome, apelidos, idade);
        this.soldo = soldo;
    }

    public int getSoldo() {
        return soldo;
    }

    public void setSoldo(int soldo) {
        this.soldo = soldo;
    }

    @Override
    void dameDescricion() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Apelidos: " + this.getApelidos());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Soldo: " + this.getSoldo());
    }
    
}
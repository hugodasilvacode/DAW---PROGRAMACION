public class Dinosaurio {
    
    private String nome;
    private int idade;

    public Dinosaurio() {
        this.nome = "Alf";
        this.idade = 5;
    }

    public Dinosaurio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}

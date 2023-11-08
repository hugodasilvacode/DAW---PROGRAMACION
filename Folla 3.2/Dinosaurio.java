public class Dinosaurio {
    
    private String nome;
    private int idade;

    public static int numDinosaurio = 0;

    public Dinosaurio() {
        this.nome = "Alf";
        this.idade = 5;
        numDinosaurio++;
    }

    public Dinosaurio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numDinosaurio++;
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

    public static String eMaisVello(Dinosaurio din1, Dinosaurio din2) {
        if (din1.getIdade()>din2.getIdade()) {
            return din1.getNome();
        }
        else {
            return din2.getNome();
        }
    }
}

/**
 * Usuario
 */
public class Usuario {
    /* ATRIBUTOS */
    
    private String nome;
    private int idade;

    /* METODOS */

    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        if (idade>0 && idade<120) {
            this.idade = idade;
        }
    }

    public int getIdade(){
        return this.idade;
    }
}
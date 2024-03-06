package Ej3;

public class Cidade implements Comparable{

    private String nome;
    private int poboacion;
    
    public Cidade(String nome, int poboacion) {
        this.nome = nome;
        this.poboacion = poboacion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoboacion() {
        return poboacion;
    }

    public void setPoboacion(int poboacion) {
        this.poboacion = poboacion;
    }

    @Override
    public int compareTo(Object o) {
        Cidade novaCidade = (Cidade) o;

        if (this.poboacion < novaCidade.poboacion) {
            return -1;
        }
        else if (this.poboacion == novaCidade.poboacion) {
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Cidade [nome=" + nome + ", poboacion=" + poboacion + "]";
    }
    
}
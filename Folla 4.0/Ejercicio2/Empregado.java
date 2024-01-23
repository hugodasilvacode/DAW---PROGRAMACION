package Ejercicio2;

public class Empregado {

    private String nome;
    private String numIdentificacion;
    private String categoria;
    private int soldo;

    public Empregado(String nome, String numIdentificacion, String categoria, int soldo) {
        this.nome = nome;
        this.numIdentificacion = numIdentificacion;
        this.categoria = categoria;
        this.soldo = soldo;
    }
    
    public Empregado(String nome, String numIdentificacion) {
        this.nome = nome;
        this.numIdentificacion = numIdentificacion;
        this.categoria = "programador";
        this.soldo = 1100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSoldo() {
        return soldo;
    }

    public void setSoldo(int soldo) {
        if (this.categoria.equals("programador")) {
            if (1100<soldo && soldo<1800) {
                this.soldo = soldo;
            }
            else {
                System.out.println("Soldo fora dos limites");
            }
        }
        else if (this.categoria.equals("analista")) {
            if (1500<soldo && soldo<2200) {
                this.soldo = soldo;
            }
            else {
                System.out.println("Soldo fora dos limites");
            }
        }
        else if (this.categoria.equals("consultor")) {
            if (1700<soldo && soldo<3500) {
                this.soldo = soldo;
            }
            else {
                System.out.println("Soldo fora dos limites");
            }
        }
        else if (this.categoria.equals("directivo")) {
            if (4000<soldo && soldo<4500) {
                this.soldo = soldo;
            }
            else {
                System.out.println("Soldo fora dos limites");
            }
        }
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", numIdentificacion=" + numIdentificacion + ", categoria=" + categoria
                + ", soldo=" + soldo + "]";
    }

    

    

    
}
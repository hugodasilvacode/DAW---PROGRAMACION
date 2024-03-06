package Ej1;

public class Estudante extends Persoa implements Comparable{

    private String titulacion;

    public Estudante(String nome, String apelidos, int idade, String titulacion) {
        super(nome, apelidos, idade);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    void dameDescricion() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Apelidos: " + this.getApelidos());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Titulacion: " + this.getTitulacion());
    }

    @Override
    public int compareTo(Object o) {
        Estudante outroEstudante = (Estudante) o;
        if (this.getIdade() < outroEstudante.getIdade()){
            return -1;
        }
        if (this.getIdade() > outroEstudante.getIdade()){
            return 1;
        }
        return 0; 
    }
    
}
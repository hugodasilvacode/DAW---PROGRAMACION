package ej2;

public class Conductor extends Traballador{
    
    private String matricula;

    public Conductor(String dni, String nome, String apelidos, String matricula) {
        super(dni, nome, apelidos);
        this.matricula = matricula;
    }

    public Conductor() {
        super();
        this.matricula = "0000BBB";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

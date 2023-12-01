package ej2;

public class Traballador {
    
    private String dni;
    private String nome;
    private String apelidos;

    public static int numTraballadores;

    public Traballador(String dni, String nome, String apelidos) {
        this.dni = dni;
        this.nome = nome;
        this.apelidos = apelidos;

        numTraballadores += 1;
    }

    public Traballador() {
        this.dni = "00000000A";
        this.nome = "nome";
        this.apelidos = "apelidos";

        numTraballadores += 1;
    }

    public String getDni() {
        return dni;
    }

    public String getNome() {
        return nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

}

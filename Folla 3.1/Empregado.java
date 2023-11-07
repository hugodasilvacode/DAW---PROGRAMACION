public class Empregado {
    
    public String nome;
    public String apelidos;
    public String DNI;
    public int salario;

    public Empregado() {
        this.nome = "Antonio";
        this.apelidos = "Silva";
        this.DNI = "32700123X";
        this.salario = 1470;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getApelidos() {
        return this.apelidos;
    }

    public String getDNI() {
        return this.DNI;
    }

    public int getSalario() {
        return this.salario;
    }
}

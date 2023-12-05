
class Vehiculo {

    private String matricula;
    private Boolean alquilado;

    public Vehiculo(String matricula, Boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
    }

    public Vehiculo() {
        this.matricula = "0000BBB";
        this.alquilado = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "matricula=" + matricula + ", alquilado=" + alquilado;
    }

    

}
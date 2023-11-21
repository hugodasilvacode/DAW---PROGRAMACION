public class Empregado {

    private String nome;
    private double antiguidade;

    public static double salarioBase = 1400;

    public static final double CONST = 10;

    public Empregado() {
        this.nome = "nomeEmpregado";
        this.antiguidade = 3;
    }

    public static double aumentarPorcentaxe(int porcentaxe) {
        return salarioBase += salarioBase * porcentaxe * 0.01;
    }

    public double salario() {
        return salarioBase + CONST * antiguidade;
    }

    public static void cambiarSalarioBase(double nuevoSalario) {
        salarioBase = nuevoSalario;
    }
}
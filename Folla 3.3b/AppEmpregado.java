
public class AppEmpregado {
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado();

        System.out.println(empregado1.salario());

        System.out.println(Empregado.aumentarPorcentaxe(10));

        System.out.println(empregado1.salario());

        Empregado.cambiarSalarioBase(1600);

        System.out.println(empregado1.salario());
    }    
}

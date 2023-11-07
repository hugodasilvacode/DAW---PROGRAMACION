public class AppEmpregado {
    
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        System.out.println("Nome: "+empregado1.getNome()+" Apelidos: "+empregado1.getApelidos()+" DNI: "+empregado1.getDNI()+" Salario: "+empregado1.getSalario());
        System.out.println("Nome: "+empregado2.getNome()+" Apelidos: "+empregado2.getApelidos()+" DNI: "+empregado2.getDNI()+" Salario: "+empregado2.getSalario());

        empregado1.setNome("Pepe");
        empregado1.setApelidos("Castro");
        empregado1.setDNI("32159753T");
        empregado1.setSalario(1230);

        empregado2.setNome("Pedro");
        empregado2.setApelidos("Lopez");
        empregado2.setDNI("32345962F");
        empregado2.setSalario(1461);

        System.out.println("Nome: "+empregado1.getNome()+" Apelidos: "+empregado1.getApelidos()+" DNI: "+empregado1.getDNI()+" Salario: "+empregado1.getSalario());
        System.out.println("Nome: "+empregado2.getNome()+" Apelidos: "+empregado2.getApelidos()+" DNI: "+empregado2.getDNI()+" Salario: "+empregado2.getSalario());

    }
}

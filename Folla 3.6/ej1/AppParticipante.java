package ej1;
public class AppParticipante {
    public static void main(String[] args) {
        
        Xogador x1 = new Xogador("Hugo", 26, "DC");
        Xogador x2 = new Xogador();
        Arbitro a1 = new Arbitro("Nestor", 27, 5);
        Arbitro a2 = new Arbitro();

        System.out.println(x1.getNome());
        System.out.println(x1.getIdade());
        System.out.println(x1.getPosto());
        System.out.println("");
        System.out.println(x2.getNome());
        System.out.println(x2.getIdade());
        System.out.println(x2.getPosto());
        System.out.println("");
        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(a1.getAnosArbitrando());
        System.out.println("");
        System.out.println(a2.getNome());
        System.out.println(a2.getIdade());
        System.out.println(a2.getAnosArbitrando());
        System.out.println("");
        System.out.println("");

        x2.setNome("Pedro");
        x2.setIdade(28);
        x2.setPosto("POR");

        a2.setNome("Dani");
        a2.setIdade(29);
        a2.setAnosArbitrando(1);

        System.out.println(x1.getNome());
        System.out.println(x1.getIdade());
        System.out.println(x1.getPosto());
        System.out.println("");
        System.out.println(x2.getNome());
        System.out.println(x2.getIdade());
        System.out.println(x2.getPosto());
        System.out.println("");
        System.out.println(a1.getNome());
        System.out.println(a1.getIdade());
        System.out.println(a1.getAnosArbitrando());
        System.out.println("");
        System.out.println(a2.getNome());
        System.out.println(a2.getIdade());
        System.out.println(a2.getAnosArbitrando());
    }
}

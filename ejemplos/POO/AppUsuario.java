

public class AppUsuario {
    
    public static void main(String[] args) {
        
        Usuario eva = new Usuario("Eva", 30);

        System.out.println("O nome e "+eva.getNome());
        System.out.println("A idade de Eva e "+eva.getIdade());

        eva.setNome("Eva Maria");
        eva.setIdade(31);

        System.out.println("O nome e "+eva.getNome());
        System.out.println("A idade e "+eva.getIdade());

    }
}

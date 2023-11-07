public class AppXogador {
    
    public static void main(String[] args) {
        
        Xogador xogador1 = new Xogador();

        System.out.println(xogador1.getNome());
        System.out.println(xogador1.getIdade());

        xogador1.setIdade(22);
        xogador1.setNome("Roi");

        System.out.println(xogador1.getNome());
        System.out.println(xogador1.getIdade());
    }
}

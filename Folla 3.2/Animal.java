public class Animal {
    private int idade;
    private String nome;
    private boolean vivo;
    
    public static int numeroAnimais = 0;

    public Animal() {
        this.idade = 7;
        this.nome = "Peter";
        this.vivo = false;
    }

    public Animal(int idade, String nome, boolean vivo) {
        this.idade = idade;
        this.nome = nome;
        this.vivo = vivo;
    }

    public static void nace(Animal animal) {
        if (!animal.vivo) {
            numeroAnimais++;
            animal.vivo = true;
            System.out.println("Bienvenido "+ animal.nome);
        }
        else {
            System.out.println("Ya estás vivo!");
        }
    }

    public static void morre(Animal animal) {
        if (animal.vivo) {
            numeroAnimais--;
            animal.vivo = false;
            System.out.println("La tierra te despide, "+ animal.nome);
        }
        else {
            System.out.println("Ya estás muerto!");
        }
    }

    public int getDatos() {
        System.out.println("Nome: "+this.nome+", Idade: "+this.idade);
        return this.idade;
    }
}
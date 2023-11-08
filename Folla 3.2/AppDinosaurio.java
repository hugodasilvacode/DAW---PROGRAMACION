public class AppDinosaurio {
    
    public static void main(String[] args) {
        
        Dinosaurio din1 = new Dinosaurio();
        Dinosaurio din2 = new Dinosaurio("Mike",12);
        Dinosaurio din3 = new Dinosaurio("Harry", 6);

        System.out.println(Dinosaurio.numDinosaurio);
        
        System.out.println("Nome: "+din1.getNome()+" Idade: "+din1.getIdade());
        System.out.println("Nome: "+din2.getNome()+" Idade: "+din2.getIdade());
        System.out.println("Nome: "+din3.getNome()+" Idade: "+din3.getIdade());

        din1.setNome("Juancho");
        din1.setIdade(4);
        din2.setNome("Paco");
        din2.setIdade(15);
        din3.setNome("Telmo");
        din3.setIdade(20);

        System.out.println("Nome: "+din1.getNome()+" Idade: "+din1.getIdade());
        System.out.println("Nome: "+din2.getNome()+" Idade: "+din2.getIdade());
        System.out.println("Nome: "+din3.getNome()+" Idade: "+din3.getIdade());

        System.out.println(Dinosaurio.eMaisVello(din1, din2));
        System.out.println(Dinosaurio.eMaisVello(din1, din3));
        System.out.println(Dinosaurio.eMaisVello(din2, din3));

    }
}

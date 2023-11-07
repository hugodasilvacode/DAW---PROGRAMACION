public class AppNave {
    
    public static void main(String[] args) {
        
        Nave Nostromo = new Nave();

        for (int i = Nostromo.getTempo(); i > 0 ; i--) {
            Nostromo.setTempo(i);
            System.out.println(Nostromo.getTempo());
        }

        System.out.println("La nave "+Nostromo.getNome()+" acaba de despegar!");
    }
}

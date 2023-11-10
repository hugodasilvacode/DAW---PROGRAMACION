public class AppParcela {
    public static void main(String[] args) {
        
        Parcela parcela1 = new Parcela("parcela1",10,11);
        Parcela parcela2 = new Parcela("parcela2",10,16);
        Parcela parcela3 = new Parcela("parcela3",10,13);
        Parcela parcela4 = new Parcela("parcela4",10,14);
        Parcela parcela5 = new Parcela("parcela5",10,15);

        Parcela maior = Parcela.calculaMaiorArea2(Parcela.calculaMaiorArea3(parcela1, parcela2, parcela3),Parcela.calculaMaiorArea2(parcela4, parcela5));

        System.out.println(maior.getNome());
        System.out.println(maior.getBase());
        System.out.println(maior.getAltura());
        System.out.println(maior.area());
    }
}

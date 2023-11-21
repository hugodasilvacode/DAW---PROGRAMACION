public class AppCoche {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche();

        System.out.println(coche1.calculaImposto());

        coche1.venda("C5225BZ");

        System.out.println(Coche.numCochesVendidos);

        coche1.setCabalosFiscais(10);

        System.out.println(coche1.calculaImposto());

    }
}

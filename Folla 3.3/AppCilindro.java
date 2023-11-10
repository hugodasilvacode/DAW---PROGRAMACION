public class AppCilindro {
    public static void main(String[] args) {
        
        Cilindro cilindro1 = new Cilindro();
        Cilindro cilindro2 = new Cilindro(0.5, 2);
        Cilindro cilindro3 = new Cilindro();

        cilindro3.setRadio(2);
        cilindro3.setAltura(0.5);

        System.out.println(cilindro1.getRadio());
        System.out.println(cilindro1.getAltura());
        System.out.println(cilindro2.getRadio());
        System.out.println(cilindro2.getAltura());
        System.out.println(cilindro3.getRadio());
        System.out.println(cilindro3.getAltura());

        System.out.println(Cilindro.area(cilindro1.getRadio(),cilindro1.getAltura()));
        System.out.println(Cilindro.volumen(cilindro1.getRadio(),cilindro1.getAltura()));
        System.out.println(Cilindro.area(cilindro2.getRadio(),cilindro2.getAltura()));
        System.out.println(Cilindro.volumen(cilindro2.getRadio(),cilindro2.getAltura()));
        System.out.println(Cilindro.area(cilindro3.getRadio(),cilindro3.getAltura()));
        System.out.println(Cilindro.volumen(cilindro3.getRadio(),cilindro3.getAltura()));

        System.out.println(cilindro1.calculaArea());
        System.out.println(cilindro1.calculaVolumen());
        System.out.println(cilindro2.calculaArea());
        System.out.println(cilindro2.calculaVolumen());
        System.out.println(cilindro3.calculaArea());
        System.out.println(cilindro3.calculaVolumen());

    }
}

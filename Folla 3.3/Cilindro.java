public class Cilindro {
    
    private double radio;
    private double altura;

    public static final double PI = 3.14159;

    public Cilindro() {
        this.radio = 1;
        this.altura = 1;
    }

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static double area(double radio, double altura) {
        return 2 * PI * radio * (radio + altura);
    }

    public static double volumen(double radio, double altura) {
        return (PI * radio * radio) * altura;
    }

    public double calculaArea() {
        return area(this.radio, this.altura);
    }

    public double calculaVolumen() {
        return volumen(this.radio, this.altura);
    }
}

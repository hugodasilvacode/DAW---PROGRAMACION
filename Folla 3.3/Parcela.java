public class Parcela {
    
    private String nome;
    private double base;
    private double altura;

    public Parcela() {
        this.nome = "parcelaSinNombre";
        this.base = 10;
        this.altura = 15;
    }

    public Parcela(String nome, double base, double altura) {
        this.nome = nome;
        this.base = base;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return this.base * this.altura;
    }

    public static Parcela calculaMaiorArea2(Parcela parc1, Parcela parc2) {
        if (parc1.area() > parc2.area()) {
            return parc1;
        }
        else {
            return parc2;
        }
    }

    public static Parcela calculaMaiorArea3(Parcela parc1, Parcela parc2, Parcela parc3) {
        Parcela maior = parc1;
        
        if (parc2.area() > maior.area()) {
            maior = parc2;
        }
        if (parc3.area() > maior.area()) {
            maior = parc3;
        }

        return maior;
    }
}

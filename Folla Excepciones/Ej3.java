/*
    Partindo do código fonte seguinte engade a capacidade de xerar 
    unha excepción cando se xere unha figura de cor branca, 
    de forma que funcione o seguinte main.
*/

class AppVariasFiguras {
    public static void main(String[] args) {

        try {
        Circulo c = new Circulo(2.0, "branco");
        System.out.println("Area circulo " + c.area());
        } catch (Exception e) {
             System.out.println("NON SE PUIDO CREAR OBXECTO: " + e.getMessage());
        }
        try {
            Triangulo t = new Triangulo(2.0, 3.0, "branco");
            System.out.println("Area triangulo " + t.area());
        } catch (Exception e) {
            System.out.println("NON SE PUIDO CREAR OBXECTO: " + e.getMessage());
        }   
    }
}

abstract class Figura {
    protected String cor;
    public Figura(String cor) throws CorBlancoExcepton {
        if (cor.equals("branco")) {
            throw new CorBlancoExcepton();
        }
        this.cor = cor;
    }
    abstract public double area();
}

class Triangulo extends Figura {
    private double base;
    private double altura;
    public Triangulo(double base, double altura, String cor) throws CorBlancoExcepton {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area() {
        return base * altura / 2;
    }
}

class Circulo extends Figura {
    private double radio;
    public Circulo(double radio, String cor) throws CorBlancoExcepton  {
        super(cor);
        this.radio = radio;
    }
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}
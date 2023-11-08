public class Bombilla {
    
    private int potencia;
    private String nome;

    private static int potenciaTotal = 0; 

    public Bombilla () {
        this.potencia = 10;
        potenciaTotal += 10;
    }

    public Bombilla (int potencia) {
        if (potencia >= 2 && potencia <= 35) {
            this.potencia = potencia;
            potenciaTotal += potencia;
        }
    }

    public void setPotencia(int potencia) {
        potenciaTotal -= this.potencia;
        this.potencia = potencia;
        potenciaTotal += potencia;

    }

    public int getPotencia() {
        return potencia;
    }

    public static int getPotenciaTotal() {
        return potenciaTotal;
    }
    
    public void aumentaPotencia (int h) {
        if ((this.potencia+h)<=35) {
            this.potencia += h;
            potenciaTotal += h;
        }
    }

    public void baixaPotencia (int h) {
        if ((this.potencia-h)>=2) {
            this.potencia -= h;
            potenciaTotal -= h;
        }
    }
}
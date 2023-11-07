public class Bombilla {
    
    private int potencia;

    public Bombilla () {
        this.potencia = 10;
    }

    public Bombilla (int potencia) {
        if (potencia >= 2 && potencia <= 35) {
            this.potencia = potencia;
        }
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
    
    public void aumentaPotencia (int h) {
        if ((this.potencia+h)<=35) {
            this.potencia += h;
        }
    }

    public void baixaPotencia (int h) {
        if ((this.potencia-h)>=2) {
            this.potencia -= h;
        }
    }
}
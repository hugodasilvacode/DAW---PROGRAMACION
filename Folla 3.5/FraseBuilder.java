public class FraseBuilder {

    private StringBuilder frase;
    private String saudo;

    public FraseBuilder() {
        this.frase = new StringBuilder();
        this.saudo = new String("Hola!");
    }

    public void iniciaFrase(String frase1) {
        this.frase.append(frase1);
    }

    public void eliminaFrase() {
        this.frase.delete(0, this.frase.length());
    }

    public void mostraFrase() {
        System.out.println(this.saudo);
        System.out.println(this.frase);
    }

    public void mostraLonxitudeCapacidade() {
        System.out.println("Lonxitude: "+this.frase.length());
        System.out.println("Capacidade: "+this.frase.capacity());
    }

    public void eliminaParte(int i, int j) {
        this.frase.delete(i, j);
    }

    public void introducirDouble(int i, double num) {
        this.frase.insert(i, num);
    }

    public void invertirFrase() {
        this.frase.reverse();
    }
}

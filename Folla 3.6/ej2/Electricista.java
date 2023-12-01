package ej2;

public class Electricista extends Traballador{
    
    private boolean fixo;

    public Electricista(String dni, String nome, String apelidos, boolean fixo) {
        super(dni, nome, apelidos);
        this.fixo = fixo;
    }

    public Electricista() {
        super();
        this.fixo = true;
    }

    public boolean getFixo() {
        return fixo;
    }

    public void setFixo(boolean fixo) {
        this.fixo = fixo;
    }
}

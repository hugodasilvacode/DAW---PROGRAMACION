/**
 * Actividade
 */
public class Actividade {
    
    private String codActividade;
    private String nomeActividade;
    private int horasSemanais;
    private int prezoActividade;
    private String salaActividade;

    public Actividade(String codActividade, String nomeActividade, int horasSemanais, int prezoActividade, String salaActividade) {
        this.codActividade = codActividade;
        this.nomeActividade = nomeActividade;
        this.horasSemanais = horasSemanais;
        this.prezoActividade = prezoActividade;
        this.salaActividade = salaActividade;
    }

    public String getCodActividade() {
        return codActividade;
    }

    public void setCodActividade(String codActividade) {
        this.codActividade = codActividade;
    }

    public String getNomeActividade() {
        return nomeActividade;
    }

    public void setNomeActividade(String nomeActividade) {
        this.nomeActividade = nomeActividade;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getPrezoActividade() {
        return prezoActividade;
    }

    public void setPrezoActividade(int prezoActividade) {
        this.prezoActividade = prezoActividade;
    }

    public String getSalaActividade() {
        return salaActividade;
    }

    public void setSalaActividade(String salaActividade) {
        this.salaActividade = salaActividade;
    }

    @Override
    public String toString() {
        return "Actividade [codActividade=" + codActividade + ", nomeActividade=" + nomeActividade + ", horasSemanais="
                + horasSemanais + ", prezoActividade=" + prezoActividade + ", salaActividade=" + salaActividade + "]";
    }

    public String toStringParaFicheiro() {
        return codActividade + ";" + nomeActividade + ";" + horasSemanais + ";" + prezoActividade + ";" + salaActividade;
    }
}
import java.util.Arrays;
import java.util.Date;

/**
 * Socio
 */
public class Socio {

    private String codSocio;
    private String nome;
    private String apelidos;
    private String email;
    private Date dataNacemento;
    private int[] actividadesInscrito;
    
    public Socio(String codSocio, String nome, String apelidos, String email, Date dataNacemento) {
        this.codSocio = codSocio;
        this.nome = nome;
        this.apelidos = apelidos;
        this.email = email;
        this.dataNacemento = dataNacemento;
        this.actividadesInscrito = new int[3];
    }

    public String getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(String codSocio) {
        this.codSocio = codSocio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(Date dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public int[] getActividadesInscrito() {
        return actividadesInscrito;
    }

    public void setActividadesInscrito(int indiceActividade) {
        for (int i = 0; i < actividadesInscrito.length; i++) {
            if (actividadesInscrito[i] == 0) {
                actividadesInscrito[i] = indiceActividade;
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Socio [codSocio=" + codSocio + ", nome=" + nome + ", apelidos=" + apelidos + ", email=" + email
                + ", dataNacemento=" + dataNacemento + ", actividadesInscrito=" + Arrays.toString(actividadesInscrito)
                + "]";
    }

    public String toStringParaFicheiro() {
        return codSocio + ";" + nome + ";" + apelidos + ";" + email + ";" + dataNacemento + ";" + Arrays.toString(actividadesInscrito);
    }

    

    
    
    

    

}
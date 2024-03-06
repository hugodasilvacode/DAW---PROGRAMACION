public class Ordenador {
    private Procesador p;
    private Memoria m;
    private DiscoDuro d;
    private int pvp;
    private String numeroDeSerie;

    public Ordenador(String numeroDeSerie, int m_capacidade, String m_tipo, int m_velocidade, double d_capacidade, String d_tipo, int d_velocidade, String p_modelo, double p_velocidade, int prezo) throws OrdenadorException{
        
        if (p_modelo.equals("i7") && !d_tipo.equals("SATA3")) {
            throw new OrdenadorException(numeroDeSerie,"I7 sen SATA3 non se pode montar");
        }
        if (numeroDeSerie.substring(0, 2).equals("HP") && m_capacidade<4) {
            throw new OrdenadorException(numeroDeSerie,"Serie HP non pode ter menos de 4gb de memoria");
        }
        m = new Memoria(m_capacidade, m_tipo, m_velocidade);
        d = new DiscoDuro(d_capacidade, d_tipo, d_velocidade);
        p = new Procesador(p_modelo, p_velocidade);
        pvp = prezo;
    }

    public int getCapacidadeMemoria() {
        return m.getCapacidade();
    }
    
}
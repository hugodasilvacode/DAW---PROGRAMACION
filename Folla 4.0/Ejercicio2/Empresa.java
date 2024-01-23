package Ejercicio2;

public class Empresa {

    private String nome;
    private String cif;
    private String localidade;
    private Empregado [] arrayEmpregado;
    
    public Empresa(String nome) {
        this.nome = nome;
        this.cif = "12345678Q";
        this.localidade = "Santiago";
        this.arrayEmpregado = new Empregado[6];
    }

    public Empresa(String nome, int numEmpregados) {
        this.nome = nome;
        this.cif = "12345678Q";
        this.localidade = "Santiago";
        this.arrayEmpregado = new Empregado[numEmpregados];
    }

    public String getNome() {
        return nome;
    }

    public String getCif() {
        return cif;
    }

    public int getNumEmpregados() {
        int numeroEmpregados = 0;
        for (int i=0; i<6; i++) {
            if (arrayEmpregado[i] != null) {
                numeroEmpregados++;
            }
        }
        return numeroEmpregados;
    }

    public boolean comprobarEmpregado(String numIdentificacion) {
        for (int i=0; i<this.getNumEmpregados()-1; i++) {
            if (arrayEmpregado[i].getNumIdentificacion().equals(numIdentificacion)) {
                return true;
            }
        }
        return false;
    }

    public String getNomeEmpregado(String numIdentificacion) {
        for (int i=0; i<this.getNumEmpregados()-1; i++) {
            if (arrayEmpregado[i].getNumIdentificacion().equals(numIdentificacion)) {
                return arrayEmpregado[i].getNome();
            }
        }
        return "";
    }

    public void getNomesEmpregados() {
        for (int i=0; i<this.getNumEmpregados()-1; i++) {
            System.out.println(arrayEmpregado[i].getNome());
        }
    }
    
    public void darDeAlta(Empregado empregadoNovo) {
        if (getNumEmpregados()<6) {
            arrayEmpregado[this.getNumEmpregados()] = empregadoNovo;
        }
        else {
            System.out.println("No puedes añadir mas empledos");
        }
    }

    public void darDeBaixa(String numIdentificacion) {
        if (this.comprobarEmpregado(numIdentificacion)) {
            for (int i=0; i<this.getNumEmpregados()-1; i++) {
                if (arrayEmpregado[i].getNumIdentificacion().equals(numIdentificacion)) {
                        arrayEmpregado[i] = null;
                        break;
                }
            }
            for (int i=1; i<6; i++) {
                if (arrayEmpregado[i] != null && arrayEmpregado[i-1] == null) {
                    arrayEmpregado[i-1] = arrayEmpregado[i];
                    arrayEmpregado[i] = null;
                }
            }
        }
        else {
            System.out.println("El empleado no esta en la empresa");
        }
    }

    public int sumSoldosEmpresa() {
        int sumSoldos = 0;
        for (int i=0; i<this.getNumEmpregados()-1; i++) {
            sumSoldos += arrayEmpregado[i].getSoldo();
        }
        return sumSoldos;
    }

    public void mostraEmpregados() {
        for (int i=0; i<this.getNumEmpregados(); i++) {
            System.out.println(arrayEmpregado[i].toString());
        }
    }

    public void mostraNumEmpregadosPorCategoria() {
        int numProgramadores = 0;
        int numAnalistas = 0;
        int numConsultores = 0;
        int numDirectivos = 0;
        for (int i=0; i<this.getNumEmpregados()-1; i++) {
            if (arrayEmpregado[i].getCategoria().equals("programador")) {
                numProgramadores++;
            }
            else if (arrayEmpregado[i].getCategoria().equals("analista")) {
                numAnalistas++;
            }
            else if (arrayEmpregado[i].getCategoria().equals("consultor")) {
                numConsultores++;
            }
            else if (arrayEmpregado[i].getCategoria().equals("directivos")) {
                numDirectivos++;
            }
        }
        System.out.println("Programadores: "+ numProgramadores);
        System.out.println("Analistas: "+ numAnalistas);
        System.out.println("Consultores: "+ numConsultores);
        System.out.println("Directivos: "+ numDirectivos);
    }


}
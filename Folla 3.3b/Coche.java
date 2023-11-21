public class Coche {
    
    private String marca;
    private String modelo;
    private double cabalosFiscais;
    private String matricula;

    public static int numCochesVendidos = 0;

    public Coche() {
        this.marca = "Fiat";
        this.modelo = "Punto";
        this.cabalosFiscais = 60;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCabalosFiscais(int cabalosFiscais) {
        this.cabalosFiscais = cabalosFiscais;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCabalosFiscais() {
        return cabalosFiscais;
    }

    public String getMatricula() {
        return matricula;
    }

    public void venda(String matricula) {
        this.matricula = matricula;
        numCochesVendidos++;
    }

    public static double calculaImposto(double cabalosFiscais) {
        if (cabalosFiscais<8) {
            return 22.20;
        }
        else if (cabalosFiscais<11.99) {
            return 61.75;
        }
        else if (cabalosFiscais<15.99) {
            return 133.95;
        }
        else if (cabalosFiscais<19.99) {
            return 179.22;
        }
        else {
            return 224.00;
        }
    }

    public double calculaImposto() {
        return Coche.calculaImposto(this.cabalosFiscais);
    }
}

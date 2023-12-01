package ej3;

public class PlanetaHostil extends Planeta {
    
    private Boolean vida;
    private Boolean fontesDeEnerxia;

    public PlanetaHostil(String nome, Double tamano, Double distancia, Boolean vida, Boolean fontesDeEnerxia) {
        super(nome, tamano, distancia);
        this.vida = vida;
        this.fontesDeEnerxia = fontesDeEnerxia;
    }
    
    public PlanetaHostil() {
        super();
        this.vida = false;
        this.fontesDeEnerxia = false;
    }

    public Boolean getVida() {
        return vida;
    }

    public void setVida(Boolean vida) {
        this.vida = vida;
    }

    public Boolean getFontesDeEnerxia() {
        return fontesDeEnerxia;
    }

    public void setFontesDeEnerxia(Boolean fontesDeEnerxia) {
        this.fontesDeEnerxia = fontesDeEnerxia;
    }

    @Override
    public String toString() {
        String superPlaneta = super.toString();
        return superPlaneta + ", vida= " + vida + ", fontesDeEnerxia= " + fontesDeEnerxia;
    }

    
}

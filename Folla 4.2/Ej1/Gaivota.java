package Ej1;

public class Gaivota implements Oviparo, Voador  {

    @Override
    public void porOvos() {
        System.out.println("A gaivota pon ovos");
        
    }

    @Override
    public void voa() {
        System.out.println("A gaivota voa");
        
    }
}
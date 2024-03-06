package Ej1;

/**
 * Ornitorrinco
 */
public class Ornitorrinco extends Mamifero implements Oviparo{

    @Override
    public void porOvos() {
        System.out.println("O ornitorrinco pon ovos");
        }

    @Override
    void amamantarCrias() {
        System.out.println("O ornitorrinco amamanta as suas crias");
        }

    
}
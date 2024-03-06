package Ej1;

public class Morcego extends Mamifero implements Voador {

    @Override
    void amamantarCrias() {
        System.out.println("O morcego amamanta as suas crias");
        
    }

    @Override
    public void voa() {
        System.out.println("O morcego voa");
        
    }
    
}
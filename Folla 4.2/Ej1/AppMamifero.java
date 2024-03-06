package Ej1;

/**
 * AppMamifero
 */
public class AppMamifero {
    public static void main(String[] args) {
        
        Mamifero balea1 = new Balea();
        Mamifero balea2 = new Balea();
        Mamifero ornit1 = new Ornitorrinco();
        Mamifero ornit2 = new Ornitorrinco();
        Mamifero morcego1 = new Morcego();
        Mamifero morcego2 = new Morcego();
        Gaivota gaivota1 = new Gaivota();
        Gaivota gaivota2 = new Gaivota();

        Mamifero [] arrayMamiferos = new Mamifero[6];

        arrayMamiferos[0] = balea1;
        arrayMamiferos[1] = balea2;
        arrayMamiferos[2] = ornit1;
        arrayMamiferos[3] = ornit2;
        arrayMamiferos[4] = morcego1;
        arrayMamiferos[5] = morcego2;

        for (Mamifero mamifero : arrayMamiferos) {
            mamifero.amamantarCrias();

            if (mamifero instanceof Oviparo) {
                ((Oviparo)mamifero).porOvos();
            }

            if (mamifero instanceof Voador) {
                ((Voador)mamifero).voa();
            }
        }

        gaivota1.porOvos();
        gaivota1.voa();
        gaivota2.porOvos();
        gaivota2.voa();

    }
}
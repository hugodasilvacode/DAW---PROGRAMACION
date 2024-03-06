package Ej1;

public class AppPersoeiros {
    public static void main(String[] args) {
        
        Persoa [] arrayPersoas = new Persoa[4];

        arrayPersoas[0] = new Empregado("hugo", "silva", 16, 2000);
        arrayPersoas[1] = new Empregado("nestor", "silva", 27, 2100);
        Estudante est1 = new Estudante("alan", "fdz", 36, "fisioterapia");
        Estudante est2 = new Estudante("alvaro", "varela", 41, "ingenieria");
        arrayPersoas[2] = est1;
        arrayPersoas[3] = est2;

        for (Persoa persoa : arrayPersoas) {
            persoa.getNome();
            persoa.dameDescricion();
        }

        System.out.println(est1.compareTo(est2));

    }
}
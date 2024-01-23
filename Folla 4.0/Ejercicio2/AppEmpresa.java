package Ejercicio2;

public class AppEmpresa {
    public static void main(String[] args) {
        
        Empresa empresa1 = new Empresa("Empresa1");
        Empresa empresa2 = new Empresa("Empresa2");

        Empregado empregado11 = new Empregado("hugo", "123", "programador", 1200);
        Empregado empregado12 = new Empregado("nes", "234", "analista", 1600);
        Empregado empregado13 = new Empregado("alan", "345", "consultor", 1800);

        Empregado empregado21 = new Empregado("paco", "456", "programador", 1200);
        Empregado empregado22 = new Empregado("berto", "567", "analista", 1600);
        Empregado empregado23 = new Empregado("kes", "678", "consultor", 1800);

        empresa1.darDeAlta(empregado11);
        empresa1.darDeAlta(empregado12);
        empresa1.darDeAlta(empregado13);

        empresa2.darDeAlta(empregado21);
        empresa2.darDeAlta(empregado22);
        empresa2.darDeAlta(empregado23);

        empresa1.darDeBaixa("123");
        empresa2.darDeBaixa("567");

        empresa1.mostraEmpregados();
        System.out.println("");
        empresa2.mostraEmpregados();

    }
}
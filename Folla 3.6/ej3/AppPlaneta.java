package ej3;

public class AppPlaneta {
    public static void main(String[] args) {

        PlanetaHabitable p1 = new PlanetaHabitable("Fion", 24.0, 1.5, 1000000, 10.0, 0.0);

        System.out.println(p1.toString());

        PlanetaHostil p2 = new PlanetaHostil("Kaleva", 50.0, 0.4, true, true);

        System.out.println(p2.toString());

        System.out.println(Planeta.numPlanetasAccesibles);
        p1.explotou();
        System.out.println(Planeta.numPlanetasAccesibles);

    }
}

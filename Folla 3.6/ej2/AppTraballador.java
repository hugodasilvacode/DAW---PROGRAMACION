package ej2;

public class AppTraballador {
    public static void main(String[] args) {
        
        Conductor c1 = new Conductor("32027101W", "Hugo", "Silva", "5055DDD");
        Conductor c2 = new Conductor();
        Electricista e2 = new Electricista();
        Electricista e1 = new Electricista("32027100R", "Nestor", "Silva", true);

        System.out.println(c1.getDni());
        System.out.println(c1.getNome());
        System.out.println(c1.getApelidos());
        System.out.println(c1.getMatricula());
        System.out.println("");
        System.out.println(c2.getDni());
        System.out.println(c2.getNome());
        System.out.println(c2.getApelidos());
        System.out.println(c2.getMatricula());
        System.out.println("");
        System.out.println(e1.getDni());
        System.out.println(e1.getNome());
        System.out.println(e1.getApelidos());
        System.out.println(e1.getFixo());
        System.out.println("");
        System.out.println(e2.getDni());
        System.out.println(e2.getNome());
        System.out.println(e2.getApelidos());
        System.out.println(e2.getFixo());
        System.out.println("");
        System.out.println("");

        c2.setDni("32159753F");
        c2.setNome("Antonio");
        c2.setApelidos("Silva");
        c2.setMatricula("5577BPM");

        e2.setDni("32456852L");
        e2.setNome("Pepe");
        e2.setApelidos("Garcia");
        e2.setFixo(false);

        System.out.println(c1.getDni());
        System.out.println(c1.getNome());
        System.out.println(c1.getApelidos());
        System.out.println(c1.getMatricula());
        System.out.println("");
        System.out.println(c2.getDni());
        System.out.println(c2.getNome());
        System.out.println(c2.getApelidos());
        System.out.println(c2.getMatricula());
        System.out.println("");
        System.out.println(e1.getDni());
        System.out.println(e1.getNome());
        System.out.println(e1.getApelidos());
        System.out.println(e1.getFixo());
        System.out.println("");
        System.out.println(e2.getDni());
        System.out.println(e2.getNome());
        System.out.println(e2.getApelidos());
        System.out.println(e2.getFixo());
        System.out.println("");
        System.out.println("");
    }
}

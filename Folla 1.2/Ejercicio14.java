public class Ejercicio14 {
    public static void main(String[] args) {
        
        double sueldo = 1200;
        double incrementoAnual = 0.03;
        System.out.println("El sueldo es de "+ sueldo +" en el ano 2002");

        for (int i = 2003; i <= 2023; i++) {
            sueldo += sueldo * incrementoAnual ;
            System.out.println("El sueldo es de "+ sueldo +" en el ano "+ i);
        }
    }
}

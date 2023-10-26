public class Ejercicio9 {
    public static void main(String[] args) {
        
        double precioCastanas = 1.20;
        double incrementoAnual = 0.1;
        System.out.println("El precio es de "+ precioCastanas +" en el ano 2018");

        for (int i = 2019; i <= 2022; i++) {
            precioCastanas += precioCastanas * incrementoAnual ;
            System.out.println("El precio es de "+ precioCastanas +" en el ano "+ i);
        }
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {

        Double sum = 0.0;

        for (double i = 0; i <40; i++) {
            sum += 1.0/(i*2.0+1);
        }

        System.out.println(sum);
    }
}
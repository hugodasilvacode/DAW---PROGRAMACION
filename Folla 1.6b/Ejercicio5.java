public class Ejercicio5 {
    public static void main(String[] args) {

        double p;
        double q;
        double r;

        for (int n = 2; n <= 10; n++) {

            p = 3 * Math.pow(2, n-1) - 1;
            q = 3 * Math.pow(2, n) - 1;
            r = 9 * Math.pow(2, 2*n-1) - 1;

            boolean primo = true;
            
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (p % i == 0) {
                    primo = false;
                    break;
                }
            }
            for (int j = 2; j <= Math.sqrt(q); j++) {
                if (q % j == 0) {
                    primo = false;
                    break;
                }
            }
            for (int k = 2; k <= Math.sqrt(r); k++) {
                if (r % k == 0) {
                    primo = false;
                    break;
                }
            }
            
            if (primo) {
                System.out.println("\n"+n);
                System.out.println(Math.pow(2, n) * p * q);
                System.out.println(Math.pow(2, n) * r);
            }
        }
    }
}
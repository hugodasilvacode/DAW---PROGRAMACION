/* 33.550.000 e 35.000.000 -> 33.550.336*/

public class Ejercicio3 {
    public static void main(String[] args) {

        for (int num=33550000; num<=35000000; num++) {

            int sum = 0;

            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (num == sum) {
                System.out.println(num);
            }
        }
    }
}
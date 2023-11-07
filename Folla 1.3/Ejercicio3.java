import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double num1 = escaner.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = escaner.nextDouble();
        System.out.println("Introduce el tercer numero");
        double num3 = escaner.nextDouble();

        if (num1<num2) {
            if (num2<num3) {
                System.out.println(num1+","+num2+","+num3);
            }
            else if (num3<num1) {
                System.out.println(num3+","+num1+","+num2);
            }
            else {
                System.out.println(num1+","+num3+","+num2);
            }
        }
        else {
            if (num1<num3) {
                System.out.println(num2+","+num1+","+num3);
            }
            else if (num3<num2) {
                System.out.println(num3+","+num2+","+num1);
            }
            else {
                System.out.println(num2+","+num3+","+num1);
            }
        }

        escaner.close();
    }
}
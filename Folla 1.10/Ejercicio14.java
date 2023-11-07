import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        Boolean salir = false;

        while (true) {
            System.out.println("a) Introducir 2 numeros.\nb) Elegir operacion.\nc) Salir.");   
            String opcion = escaner.next();

            switch (opcion) {
                case "a" :
                    System.out.println("Introduce un numero");
                    num1 = escaner.nextDouble();
                    System.out.println("Introduce un numero");
                    num2 = escaner.nextDouble();
                    break;
                case "b" :
                    System.out.println("Elije la operación a realizar ( * , / , + ó - )");
                    String ope = escaner.next();
                    switch (ope) {
                        case "*":
                            System.out.println(mult(num1,num2));
                            break;
                        case "/":
                            System.out.println(divi(num1,num2));
                            break;
                        case "+":
                            System.out.println(suma(num1,num2));
                            break;
                        case "-":
                            System.out.println(rest(num1,num2));
                            break;
                    }
                    break;
                case "c" :
                    salir = true;
                    break;
            }

            if (salir) {break;}
        }
        escaner.close();
    }
    public static double mult(double a, double b) {
        return a * b;
    }
    public static double divi(double a, double b) {
        return a / b;
    }
    public static double suma(double a, double b) {
        return a + b;
    }
    public static double rest(double a, double b) {
        return a - b;
    }
}
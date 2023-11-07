import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        double num1 = escaner.nextDouble();

        System.out.println("Introduce otro numero");
        double num2 = escaner.nextDouble();

        System.out.println("Introduce el operador (+, -, *, /)");
        String oper = escaner.next();

        switch(oper) {
            case "+":  
                System.out.println(num1 + oper + num2 +" = "+ (num1+num2));
                break;
            case "-":
                System.out.println(num1 + oper + num2 +" = "+ (num1-num2));
                break;
            case "*":
                System.out.println(num1 + oper + num2 +" = "+ (num1*num2));
                break;
            case "/":
                System.out.println(num1 + oper + num2 +" = "+ (num1/num2));
                break;
        }
        
        escaner.close();
    }
}
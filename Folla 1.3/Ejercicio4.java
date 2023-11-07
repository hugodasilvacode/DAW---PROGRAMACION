import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int menor;
        int segundoMenor;

        System.out.println("Introduce el primer numero");
        int num1 = escaner.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = escaner.nextInt();
        
        if (num1<num2){
            menor = num1;
            segundoMenor = num2;
        }
        else {
            menor = num2;
            segundoMenor = num1;
        }
        
        for (int i = 1; i <= 2; i++) {
            System.out.println("Introduce otro numero");
            int num = escaner.nextInt();

            if (num < menor) {
                segundoMenor = menor;
                menor = num;
            }
            else if (num < segundoMenor) {
                segundoMenor = num;
            }
        }

        System.out.println(segundoMenor);

        escaner.close();
    }
}
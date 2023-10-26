/*
Programa que mostre un menú como o seguinte:
1. Introducir tres valores enteiros.
2. Mostrar a media
3. Mostrar o produto
4. Mostrar o maior
5. Sair
E faga o que indica o menú, cada vez que se preme a tecla correspondente.
OLLO: Non poderá facer nada se non se introduciron previamente valores para as variables,
pero estas só se introducirán ao premer o a).
 */

 import java.util.Scanner;

 public class Ejercicio1 {
     public static void main(String[] args) {
         Scanner escaner = new Scanner(System.in);
         int num1 = 0;
         int num2 = 0;
         int num3 = 0;
         boolean salir = false;
         boolean nums = false;
         int max = 0;
         int min = 0;
 
         while (true) {
             System.out.println("a) Introducir 3 números enteiros.\nb) Calcular o máximo.\nc) Calcular o produto.\nd) Calcular a media.\ne) Salir.");
             String opcion = escaner.next();
 
             switch (opcion) {
                 case "a" :
                     System.out.println("Introduce un entero");
                     num1 = escaner.nextInt();
                     max = num1;
                     min = num1;
                     System.out.println("Introduce un entero");
                     num2 = escaner.nextInt();
                     if (num2>max) {max = num2;}
                     else if (num2<min) {min = num2;}
                     System.out.println("Introduce un entero");
                     num3 = escaner.nextInt();
                     if (num3>max) {max = num3;}
                     else if (num3<min) {min = num3;}
                     nums = true;
                     break;
                 case "b" :
                     if (nums) {
                         System.out.println(max);
                     }
                     else {
                         System.out.println("No has introducido los numeros");
                     }
                     break;
                 case "c" :
                     if (nums) {
                         System.out.println(num1 * num2 * num3);
                     }
                     else {
                         System.out.println("No has introducido los numeros");
                     }
                     break;
                 case "d" :
                     if (nums) {
                         System.out.println((num1+num2+num3)*0.33333333);
                     }
                     else {
                         System.out.println("No has introducido los numeros");
                     }
                     break;
                 case "e" :
                     salir = true;
                     break;
             }
             if (salir) {
                 break;
             }
         }
         escaner.close();
     }    
 }
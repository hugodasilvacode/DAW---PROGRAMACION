/*
Cal sería o código para saber se o indicado no path é un ficheiro? 
E se é posible escribir no mesmo? 
Fai un programa que vaia pedindo o nome dun ficheiro, 
e mostre se existe e se é posible escribir no mesmo. 
Faino coa clase File, e coa API NIO. 
*/

import java.io.File;

public class Ej1 {
    public static void main(String[] args) {
        
        File path = new File("./Ej1.java");

        if (path.exists()) {
            System.out.println("La ruta existe");
            if (path.isDirectory()) {
                System.out.println("Es un directorio");
            }
            else if (path.isFile()) {
                System.out.println("Es un archivo");
                if (path.canWrite()) {
                    System.out.println("Es posible escribir en el");
                }
                else {
                    System.out.println("No es posible escribir en el");
                }
            }
        }
        else {
            System.out.println("La ruta no existe");
        }
        
    }
    
}
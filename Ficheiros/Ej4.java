/*
Fai un programa que pida repetidamente o nome dun ficheiro ou directorio, 
con JoptionPane, e vaia indicando se é unha carpeta ou un ficheiro. 
O programa rematará cando se teclee “fin”.
*/

import java.io.File;

import javax.swing.JOptionPane;

public class Ej4 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Introduce nome");

        while (!nome.equals("fin")) {
            
            File path = new File(nome);

            if (path.exists()) {
                System.out.println("La ruta existe");
                if (path.isDirectory()) {
                    System.out.println("Es un directorio");
                }
                else if (path.isFile()) {
                    System.out.println("Es un archivo");
                }
            }
            else {
                System.out.println("La ruta no existe");
            }

            nome = JOptionPane.showInputDialog("Introduce nome");
        }
    }
}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Ej8 {
    public static void main(String[] args) throws IOException {

        Path carpetaPath = Paths.get("./ficheirosTemporais");

        int numFiles = (int) Files.list(carpetaPath).count();

        while (numFiles>0) {

            String nome = JOptionPane.showInputDialog("Introduce nome");

            Path filePath = Paths.get("./ficheirosTemporais/"+nome);

            if (Files.exists(filePath)) {
                Files.delete(filePath);
                if (Files.exists(filePath)) {
                    System.out.println("No se ha eliminado");
                }
                else {
                    System.out.println("Archivo eliminado");
                } 
            }
            else {
                System.out.println("El archivo no existe");
            }

            numFiles = (int) Files.list(carpetaPath).count();
        }
        
    }
    
}
/*
Fai un programa que pida o nome dun ficheiro con JOptionPane, e se existe o copie nunha
carpeta “copia”. Execútao varias veces e comproba que funciona.
*/

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej2 {
    public static void main(String[] args) throws IOException {

        String nome = "./Ej1.java"; /*JOptionPane.showInputDialog("Introduce nombre archivo");*/
        
        File path = new File(nome);

        Path pathPath = Paths.get(nome);

        if (path.exists()) {
            File nuevaCarpeta = new File("./copia");
            nuevaCarpeta.mkdir();
            Files.copy(pathPath, Paths.get("./copia/"+path.getName()), StandardCopyOption.REPLACE_EXISTING);
        }
        else {
            System.out.println("La ruta no existe");
        }
        
    }
    
}
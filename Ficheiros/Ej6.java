import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Ej6 {
    public static void main(String[] args) throws IOException {

        Path nuevaCarpeta = Paths.get("./ficheirosTemporais");

        Files.createDirectories(nuevaCarpeta);

        for (int i = 1; i <= 5; i++) {

            String nome = "exemplo"+i+".txt";
            
            String frase = JOptionPane.showInputDialog("Introduce una frase");
        
            Path nuevoTxt = Paths.get("./ficheirosTemporais/"+nome);
            Files.createFile(nuevoTxt);

            if (Files.exists(nuevoTxt)) {
                try (FileWriter fw = new FileWriter(nuevoTxt.toString())) {
                    fw.write(frase);
                }
            }
        }
        
        
    }
    
}
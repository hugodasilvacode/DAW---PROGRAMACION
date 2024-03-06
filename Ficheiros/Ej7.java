
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej7 {
    public static void main(String[] args) throws IOException {

        Path nuevaCarpeta = Paths.get("./ficheirosTemporaisCopia");

        Files.createDirectories(nuevaCarpeta);

        Path txt1 = Paths.get("./ficheirosTemporais/exemplo1.txt");
        Path txt2 = Paths.get("./ficheirosTemporais/exemplo2.txt");
        
        Files.copy(txt1, Paths.get("./ficheirosTemporaisCopia/exemplo1.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(txt2, Paths.get("./ficheirosTemporaisCopia/exemplo2.txt"), StandardCopyOption.REPLACE_EXISTING);

    }
    
}
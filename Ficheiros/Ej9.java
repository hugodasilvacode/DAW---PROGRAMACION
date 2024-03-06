/*
Escribe un programa que amañe un ficheiro de texto, quitando espazos baleiros e poñendo a
primeira letra de cada liña en maiúscula. Para isto crea un ficheiro temporal (mira
File.createTempFile()) , que logo sobreescribirá o ficheiro orixinal.
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej9 {
    public static void main(String[] args) throws IOException {

        Path textoPath = Paths.get("./texto.txt");
        File fichero = new File("texto.txt");
        File f = File.createTempFile("textoTemp", ".txt");

        if (Files.exists(textoPath)) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

                String line = br.readLine();
                while (line != null) {
                    String letraInicial = String.valueOf(line.charAt(0));
                    line = line.replaceFirst(letraInicial,letraInicial.toUpperCase());

                    while (line.contains("  ")) {
                        line = line.replaceAll("  "," ");
                    }

                    bw.write(line);
                    bw.newLine();

                    System.out.println(line);
                    line = br.readLine();
                }
            }

            Files.copy(f.toPath(), textoPath, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
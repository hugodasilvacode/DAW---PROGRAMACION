import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GardarCilentes {
    public static void main(String[] args) throws IOException {
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente("Ana", "Fernández López",23));
        clientes.add(new Cliente("Antón", "Sueiro Sueiro",33));
        clientes.add(new Cliente("Xan", "Ferreiro Ferreiro",77));

        String fichero = "clientes.txt"; 
        File f = new File(fichero);

        try (FileWriter fw = new FileWriter(f)) {
            PrintWriter escritura = new PrintWriter(fw);

            for (int i = 0; i < clientes.size(); i++) {
                String cadea = clientes.get(i).getNome()+";"+clientes.get(i).getApelidos()+";"+clientes.get(i).getIdade();
                escritura.println(cadea);
            }

        } catch (IOException e) {
            System.out.println("Non se pode abrir o ficheiro para escritura");
        }
        
    }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LerClientes {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        String fichero = "clientes.txt"; 
        File f = new File(fichero);
        
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String cadea;
            String [] atributos;
            while((cadea = br.readLine())!= null){
                atributos = cadea.trim().split(";");
                clientes.add(new Cliente(atributos[0], atributos[1], Integer.parseInt(atributos[2])));
           }
           br.close();

           for (Cliente cliente : clientes) {
                System.out.println(cliente.getNome()+", "+cliente.getApelidos()+", "+cliente.getIdade());
           }
        } catch (Exception e) {
            System.out.println("Houbo un problema lendo o ficheiro");
        }
     
     }
}
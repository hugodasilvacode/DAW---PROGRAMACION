import java.io.File;

public class Ej5 {
    public static void main(String[] args) {
        
        File path = new File("./Ej1.java");

        if (path.exists()) {
            System.out.println("La ruta existe");
            if (path.isDirectory()) {
                System.out.println("Es un directorio");
            }
            else if (path.isFile()) {
                System.out.println("Es un archivo");
                System.out.println("Nome: "+path.getName());
                System.out.println("Tamano: "+path.length()/1024.0+" kB");
                if (path.canRead()) {
                    System.out.println("Tiene permisos de lectura");
                    
                }
                else {
                    System.out.println("No tiene permisos de lectura");
                }
                if (path.canWrite()) {
                    System.out.println("Tiene permisos de escritura");
                    
                }
                else {
                    System.out.println("No tiene permisos de escritura");
                }
            }
        }
        else {
            System.out.println("La ruta no existe");
        }
        
    }
    
}
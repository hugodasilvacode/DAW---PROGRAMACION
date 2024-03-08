import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * AppSociocultural
 */
public class AppSociocultural {
    public static void main(String[] args) {

        ArrayList<Actividade> arrayActividades = new ArrayList<Actividade>();
        ArrayList<Socio> arraySocios = new ArrayList<Socio>();

        String menu = """
                1) Xestionar actividades
                2) Xestionar socios
                3) Asignar/desasignar actividades aos socios
                4) Mostrar as actividades dun socio
                """;
        
        String menu1 = """
                1) Mostrar todas as actividades
                2) Engadir actividade
                3) Borrar actividade
                4) Gardar en ficheiro
                """;

        String menu2 = """
                1) Mostrar todos os socios
                2) Engadir socio
                3) Borrar socio
                4) Buscar por apelido
                5) Gardar en ficheiro
                """;

        String menu3 = """
                1) Asignar actividade
                2) Desasignar actividade
                """;

        String opcion = JOptionPane.showInputDialog(menu);
        switch (opcion) {
            case "1":
                String opcion1 = JOptionPane.showInputDialog(menu1);
                switch (opcion1) {
                    case "1":
                        mostrarActividades(arrayActividades);
                        break;
                    case "2":
                        engadirActividae(arrayActividades);
                        break;
                    case "3":
                        borrarActividade(arrayActividades);
                        break;
                    case "4":
                        gardarActividadeFicheiro(arrayActividades);
                        break;
                }
                break;
            case "2":
                String opcion2 = JOptionPane.showInputDialog(menu2);
                switch (opcion2) {
                    case "1":
                        mostrarSocios(arraySocios);
                        break;
                    case "2":
                        engadirSocio(arraySocios);
                        break;
                    case "3":
                        borrarSocio(arraySocios);
                        break;
                    case "4":
                        buscarSocioApelido(arraySocios);
                        break;
                    case "5":
                        gardarSocioFicheiro(arraySocios);
                        break;
                }
                break;
            case "3":
                String opcion3 = JOptionPane.showInputDialog(menu3);
                switch (opcion3) {
                    case "1":
                        asignarActividadeSocio(arrayActividades,arraySocios);
                        break;
                    case "2":
                        desasignarActividadeSocion(arrayActividades,arraySocios);
                        break;
                }
                break;
            case "4":
                mostrarActividadesSocio(arraySocios);
                break;
        }
    }
}
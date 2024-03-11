import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
                        desasignarActividadeSocio(arrayActividades,arraySocios);
                        break;
                }
                break;
            case "4":
                mostrarActividadesSocio(arrayActividades,arraySocios);
                break;
        }
    }

    public static void mostrarActividades(ArrayList<Actividade> arrayActividades) {
        for (Actividade actividade : arrayActividades) {
            System.out.println(actividade.toString());
        }
    }

    public static void engadirActividae(ArrayList<Actividade> arrayActividades) {

        boolean existe = false;

        int codActividade = Integer.parseInt(JOptionPane.showInputDialog("Codigo de actividade"));
        String nomeActividade = JOptionPane.showInputDialog("Nome da actividade");
        int horasSemanais = Integer.parseInt(JOptionPane.showInputDialog("Horas semanais"));
        int prezoActividade = Integer.parseInt(JOptionPane.showInputDialog("Prezo da actividade"));
        String salaActividade = JOptionPane.showInputDialog("Sala da actividade");

        for (Actividade actividade : arrayActividades) {
            if (actividade.getCodActividade() == codActividade) {
                System.out.println("Ya exixste una actividad con este codigo");
                existe = true;
                break;
            }
        }

        if (!existe) {
            Actividade novaActividade = new Actividade(codActividade, nomeActividade, horasSemanais, prezoActividade, salaActividade);
            arrayActividades.add(novaActividade);
        }
    }

    public static void borrarActividade(ArrayList<Actividade> arrayActividades) {

        boolean existe = false;
        
        int codActividade = Integer.parseInt(JOptionPane.showInputDialog("Codigo de actividade"));

        for (Actividade actividade : arrayActividades) {
            if (actividade.getCodActividade() ==codActividade) {
                existe = true;
                arrayActividades.remove(actividade);
                break;
            }
        }

        if (!existe) {
            System.out.println("No existe ninguna actividad con este codigo");
        }

    }

    public static void mostrarSocios(ArrayList<Socio> arraySocios) {
        for (Socio socio : arraySocios) {
            System.out.println(socio.toString());
        }
    }

    public static void engadirSocio(ArrayList<Socio> arraySocios) throws ParseException {

        boolean existe = false;

        String codSocio = JOptionPane.showInputDialog("Codigo de socio");
        String nome = JOptionPane.showInputDialog("Nome");
        String apelidos = JOptionPane.showInputDialog("Apelidos");
        String email = JOptionPane.showInputDialog("Email");

        String dataNacementoString = JOptionPane.showInputDialog("Data de nacemento");

        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dataNacemento = formatter.parse(dataNacementoString);

        for (Socio socio : arraySocios) {
            if (socio.getCodSocio().equals(codSocio)) {
                System.out.println("Ya exixste un socio con este codigo");
                existe = true;
                break;
            }
        }

        if (!existe) {
            Socio novoSocio = new Socio(codSocio, nome, apelidos, email, dataNacemento);
            arraySocios.add(novoSocio);
        }
    }

    public static void borrarSocio(ArrayList<Socio> arraySocios) {

        boolean existe = false;
        
        String codSocio = JOptionPane.showInputDialog("Codigo de socio");

        for (Socio socio : arraySocios) {
            if (socio.getCodSocio().equals(codSocio)) {
                existe = true;
                arraySocios.remove(socio);
                break;
            }
        }

        if (!existe) {
            System.out.println("No existe ningun socio con este codigo");
        }

    }

    public static void buscarSocioApelido(ArrayList<Socio> arraySocios) {

        boolean existe = false;
        
        String apelidos = JOptionPane.showInputDialog("Apelidos");

        for (Socio socio : arraySocios) {
            if (socio.getApelidos().equals(apelidos)) {
                existe = true;
                System.out.println(socio.toString());
            }
        }

        if (!existe) {
            System.out.println("No existe ningun socio con este codigo");
        }
    }

    public static void asignarActividadeSocio(ArrayList<Actividade> arrayActividades, ArrayList<Socio> arraySocios) {

        boolean existeSocio = false;
        boolean existeActividade = false;
        boolean estaInscrito = false;
        
        String codSocio = JOptionPane.showInputDialog("Codigo de socio");
        int codActividade = Integer.parseInt(JOptionPane.showInputDialog("Codigo de actividade"));

        for (Socio socio : arraySocios) {
            if (socio.getCodSocio().equals(codSocio)) {
                existeSocio = true;

                for (Actividade actividade : arrayActividades) {
                    if (actividade.getCodActividade() == codActividade) {
                        existeActividade = true;

                        int[] actividadesInscrito = socio.getActividadesInscrito();
                        for (int actividadeInscrito : actividadesInscrito) {
                            if (actividadeInscrito == codActividade) {
                                estaInscrito = true;
                                System.out.println("Este socio ya está incrito en esta actividad");
                                break;
                            }
                        }
                        if (!estaInscrito) {
                            socio.setActividadesInscrito(codActividade);
                        }
                        break;
                    }
                }
                if (!existeActividade) {
                    System.out.println("No existe ninguna actividad con este codigo");
                }
                break;
            }
        }
        if (!existeSocio) {
            System.out.println("No existe ningun socio con este codigo");
        }
        

    }

    public static void desasignarActividadeSocio(ArrayList<Actividade> arrayActividades, ArrayList<Socio> arraySocios) {

        boolean existeSocio = false;
        boolean existeActividade = false;
        boolean estaInscrito = false;
        
        String codSocio = JOptionPane.showInputDialog("Codigo de socio");
        int codActividade = Integer.parseInt(JOptionPane.showInputDialog("Codigo de actividade"));

        for (Socio socio : arraySocios) {
            if (socio.getCodSocio().equals(codSocio)) {
                existeSocio = true;

                for (Actividade actividade : arrayActividades) {
                    if (actividade.getCodActividade() == codActividade) {
                        existeActividade = true;

                        int[] actividadesInscrito = socio.getActividadesInscrito();
                        for (int actividadeInscrito : actividadesInscrito) {
                            if (actividadeInscrito == codActividade) {
                                estaInscrito = true;
                                actividadeInscrito = 0; /*COMPROBAR */
                                break;
                            }
                        }
                        if (!estaInscrito) {
                            System.out.println("Este socio no está incrito en esta actividad");
                        }
                        break;
                    }
                }
                if (!existeActividade) {
                    System.out.println("No existe ninguna actividad con este codigo");
                }
                break;
            }
        }
        if (!existeSocio) {
            System.out.println("No existe ningun socio con este codigo");
        }
    }

    public static void mostrarActividadesSocio(ArrayList<Actividade> arrayActividades, ArrayList<Socio> arraySocios) {

        boolean existe = false;
        
        String codSocio = JOptionPane.showInputDialog("Codigo de socio");

        for (Socio socio : arraySocios) {
            if (socio.getCodSocio().equals(codSocio)) {
                existe = true;

                int[] actividadesInscrito = socio.getActividadesInscrito();
                for (int actividadeInscrito : actividadesInscrito) {
                    for (Actividade actividade : arrayActividades) {
                        if (actividade.getCodActividade() == actividadeInscrito) {
                            actividade.toString();
                            break;
                        }
                    }
                }
                break;
            }
        }

        if (!existe) {
            System.out.println("No existe ningun socio con este codigo");
        }

    }
}
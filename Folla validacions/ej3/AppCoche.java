package ej3;

import java.util.Objects;

import javax.swing.JOptionPane;

public class AppCoche {
    public static void main(String[] args) {

        Coche [] arrayCoches = new Coche[4];

        int numCoches = 0;
        
        String opcion = "a";

        while (!opcion.equals("c")) {

            System.out.println("a) Introducir un vehiculo");
            System.out.println("b) Mostrar vehiculos");
            System.out.println("c) Salir\n");

            opcion = JOptionPane.showInputDialog("Selecciona una opcion");

            switch (opcion) {
                case "a":
                    if (numCoches<4) {
                        try {
                            String matricula = JOptionPane.showInputDialog("Introduce la matricula");
                            int prezo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio"));
                            String modelo = JOptionPane.showInputDialog("Introduce el modelo");

                            arrayCoches[numCoches] = new Coche(matricula, prezo, modelo);

                            System.out.println("Coche creado correctamente");
                            numCoches++;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case "b":
                    System.out.println(numCoches);
                    for (int i = 0; i < numCoches-1; i++) {
                        Coche coche = arrayCoches[i];
                        System.out.println(numCoches);
                        System.out.println(coche.describeCoche());
                    }
                    break;
                case "c":

                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
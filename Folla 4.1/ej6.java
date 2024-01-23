/* Fai un programa que faga repetidamente conversións de euros a dólares ou viceversa, empregando
JoptionPane. O valor numérico do resultado deberá ter sempre un ancho de 7 en total, con 2 decimais.
O programa deberá preguntar que tipo de cambio quere facer, de cada vez, ou se quere saír do
programa: mostra un menú con varias liñas empregando “\n” en linux (ou “\r\n” en Windows).
Tamén podes empregar “%n” se empregas o método da clase String.format() */

import javax.swing.JOptionPane;

public class ej6 {
    public static void main(String[] args) {

        String menu = """
                      a) Euros a dolares.
                      b) Dolares a euros.
                      c) Salir.
                      """;
        String opcion;
     
        do {
            opcion = JOptionPane.showInputDialog(menu);

            switch (opcion) {
                case "a":
                    String eurosString = JOptionPane.showInputDialog("Introduce euros");
                    double dolares = 1.09 * Double.valueOf(eurosString);
                    System.out.printf("%7.2f%n",dolares);
                    break;
            
                case "b":
                    String dolaresString = JOptionPane.showInputDialog("Introduce dolares");
                    double euros = (1.0/1.09) * Double.valueOf(dolaresString);
                    System.out.printf("%7.2f%n",euros);
                    break;
            }

        } while (!opcion.equals("c"));
        

    }
}
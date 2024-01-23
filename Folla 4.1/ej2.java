import javax.swing.JOptionPane;

public class ej2 {
    public static void main(String[] args) {

        String texto = """
                        a) Introducir un enteiro
                        b) Mostrar o enteiro en binario
                        c) Mostrar el entero en octal
                        d) Mostrar el ento en hexadecimal
                        """;

        String opcion;

        String enteiroString = "";
        int enteiro = 0;

        while (true) {
            
            opcion = JOptionPane.showInputDialog(texto);

            switch (opcion) {
                case "a":
                    enteiroString = JOptionPane.showInputDialog("Introduce un enteiro:");
                    enteiro = Integer.valueOf(enteiroString);
                    break;
                case "b":
                    String binario = Integer.toBinaryString(enteiro);
                    System.out.println(binario);
                    break;
                case "c":
                    String octal = Integer.toOctalString(enteiro);
                    System.out.println(octal);
                    break;
                case "d":
                    String hexa = Integer.toHexString(enteiro);
                    System.out.println(hexa);
                    break;
                
            }
            
        }

    }
}
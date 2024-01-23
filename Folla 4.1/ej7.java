import javax.swing.JOptionPane;

public class ej7 {
    public static void main(String[] args) {
        
        String palabra = "caramelo";
        String xogada = "________";
        StringBuilder letrasUsadas = new StringBuilder();

        char [] palabraArray = palabra.toCharArray();
        char [] xogadaArray = xogada.toCharArray();

        int intentos = 0;

        char letra;
        boolean exito;

        do {letra = JOptionPane.showInputDialog("Elige una letra").charAt(0);
            exito = false;

            for (int i=0; i<palabraArray.length; i++) {
                Character c = palabraArray[i];
                if (c.equals(letra)) {
                    xogadaArray[i] = (char) c;
                    exito = true;
                }
            }

            if (!exito) {
                intentos++;
            }
            
            letrasUsadas.append(letra+", ");
            System.out.println(mostraArray(xogadaArray));
            System.out.println(letrasUsadas);
            System.out.println("Intentos: "+intentos);
            System.out.println("");
            
        } while (intentos<=10 && (!mostraArray(palabraArray).equals(mostraArray(xogadaArray))));
    }

    public static String mostraArray(char [] letrasArray) {
        StringBuilder palabraDevolve = new StringBuilder();

        for (Character c : letrasArray) {
            palabraDevolve.append(c+" ");
        }

        return palabraDevolve.toString();
    }
}
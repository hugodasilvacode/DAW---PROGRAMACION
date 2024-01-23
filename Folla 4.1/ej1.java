import javax.swing.JOptionPane;

public class ej1 {
    public static void main(String[] args) {

        String cadeaBinario;
        cadeaBinario = JOptionPane.showInputDialog("Introduce cadea en binrio:");

        int enteiro = Integer.parseInt(cadeaBinario,2);

        System.out.println(enteiro);

    }
}
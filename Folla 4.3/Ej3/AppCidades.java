package Ej3;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppCidades {
    public static void main(String[] args) {
        
        Cidade [] arrayCidades = new Cidade[5];

        for (int i = 0; i < 5; i++) {
            String nomeCidade = JOptionPane.showInputDialog("Nome da cidade");
            int poboacionCidade = Integer.parseInt(JOptionPane.showInputDialog("Poboacion da cidade"));
            arrayCidades[i] = new Cidade(nomeCidade, poboacionCidade);
        }

        Arrays.sort(arrayCidades);

        for (Cidade cidade : arrayCidades) {
            cidade.toString();
        }

    }
}
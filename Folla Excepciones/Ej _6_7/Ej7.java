/*
    Empregando as clases do exercicio anterior, define unha clase AppExercicio7 
    que defina un array de 3 ordenadores. A continuación se pedirán os valores 
    por teclado para eses 3 ordenadores con JOptionPane. O programa deberá controlar 
    todas as excepcións posibles de entrada de datos, de modo que se un ordenador non 
    se pode montar non se engadirá ao array. As restriccións do exercicio anterior 
    tamén deben impedir engadir un ordenador ao array. Cada vez que se lance unha 
    excepción deberá saír por consola unha descrición da mesma.

    Unha vez introducidos valores correctos para os 3 ordenadores, 
    o programa mostrará as características deses 3 ordenadores.
*/

import java.lang.reflect.Field;

import javax.swing.JOptionPane;

class AppExercicio7 {
    public static void main(String[] args) {
        
        Ordenador [] arrayOrdenador = new Ordenador[3]; 

        for (int i = 0; i < arrayOrdenador.length; i++) {

            String numeroDeSerie = JOptionPane.showInputDialog("numeroDeSerie");

            int m_capacidade = Integer.parseInt(JOptionPane.showInputDialog("m_capacidade"));

            String m_tipo = JOptionPane.showInputDialog("m_tipo");

            int m_velocidade = Integer.parseInt(JOptionPane.showInputDialog("m_velocidade"));

            double d_capacidade = Double.parseDouble(JOptionPane.showInputDialog("d_capacidade"));

            String d_tipo = JOptionPane.showInputDialog("d_tipo");

            int d_velocidade = Integer.parseInt(JOptionPane.showInputDialog("d_velocidade"));

            String p_modelo = JOptionPane.showInputDialog("p_modelo");

            double p_velocidade = Double.parseDouble(JOptionPane.showInputDialog("p_velocidade"));

            int prezo = Integer.parseInt(JOptionPane.showInputDialog("prezo"));

            try {
                arrayOrdenador[i] = new Ordenador(numeroDeSerie, m_capacidade, m_tipo, m_velocidade, d_capacidade, d_tipo, d_velocidade, p_modelo, p_velocidade, prezo);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
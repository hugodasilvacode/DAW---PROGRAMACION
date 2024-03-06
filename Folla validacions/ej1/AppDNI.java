package ej1;
import javax.swing.JOptionPane;

public class AppDNI {
    public static void main(String[] args) throws DNIException {
        
        String [] arrayStringDNI = {"32720101W","327201008","W27201013"};

        DNI [] arrayDNI = new DNI[3];

        for (int i = 0; i < arrayDNI.length; i++) {
            
            try {
                DNI dni = new DNI(arrayStringDNI[i]);
                arrayDNI[i] = dni;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                String nuevoCodigo = JOptionPane.showInputDialog("Introdice el dni");
                arrayStringDNI[i] = nuevoCodigo;
                i--;
            }
        }

        for (DNI dni : arrayDNI) {
            System.out.println(dni.getStringDni());
        }
    }
    
}
package ej2;

import javax.swing.JOptionPane;

public class AppIP {
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            
            String ip = JOptionPane.showInputDialog("Introduce una IP");

            try {
                IP nuevaIP = new IP(ip);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;

            }

        }

    }
}
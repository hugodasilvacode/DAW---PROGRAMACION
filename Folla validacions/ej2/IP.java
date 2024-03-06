package ej2;

public class IP {

    private String direccionIP;

    public IP(String direccionIP) throws IPException{

        String[] partes = direccionIP.split("\\.");

        if (partes.length != 4) {
            throw new IPException("Longitud invalida.");
        }

        for (int i = 0; i < partes.length; i++) {
            int num = Integer.parseInt(partes[i]);

            if (num<0 || num>255) {
                throw new IPException("Numero fuera de limites");
            }
        }

        this.direccionIP = direccionIP;

    }
}
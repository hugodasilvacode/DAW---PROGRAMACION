package ej1;
/*
Define unha clase DNI para que o construtor procese o string, axustando ao seguinte formato do DNI: 
de 1 a 8 díxitos seguidos por unha letra maiúscula ou minúscula.

Fai unha excepción personalizada empregando unha clase DNIException.

O programa AppDNI deberá pedir 3 DNI’s nun array, comprobar cada un cando se introducen 
(se é erróneo pedirao de novo) e cando xa están introducidos os 3 valores mostrar todos os valores.

 */

public class DNI {
 
    private String stringDni;

    public DNI(String stringDni) throws DNIException{

        try {
            comprobaDNI(stringDni);
            this.stringDni = stringDni;
        } catch (Exception e) {
            throw new DNIException();
        }
    }

    public void comprobaDNI(String dni) throws DNIException{

        char [] dnichar = dni.toCharArray();

        if (dnichar.length != 9) {
            throw new DNIException();
        }

        for (int i = 0; i < dnichar.length-1; i++) {
            char num = dnichar[i];
            if (!Character.isDigit(num)) {
                throw new DNIException();
            }
        }

        char letra = dnichar[8];
        if (!Character.isLetter(letra)) {
            throw new DNIException();
        }
    }

    public String getStringDni() {
        return stringDni;
    }

    public void setStringDni(String stringDni) {
        this.stringDni = stringDni;
    }

    
}
package ej3;

import java.util.Arrays;

public class Coche {

    private String matricula;
    private int prezo;
    private String modelo;

    private static final char[] LETRAS = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

    public Coche(String matricula, int prezo, String modelo) throws CocheException {

        if (!comprobaMatricula(matricula)) {
            throw new CocheException("Formato de matricula incorrecto");
        }
        else {
            this.matricula = matricula;
        }
        if (!comprobaPrezo(prezo)) {
            throw new CocheException("Prezo incorrecto");
        }
        else {
            this.prezo = prezo;
        }
        if (!comprobaModelo(modelo)) {
            throw new CocheException("Modelo incorrecto");
        }
        else {
            this.modelo = modelo;
        }
    }

    public static boolean comprobaMatricula(String matricula) {
        
        char [] matriculaArray = matricula.toCharArray();

        for (int i = 0; i < matriculaArray.length; i++) {
            char matr_i = matriculaArray[i];
            if (i<4 && !Character.isDigit(matr_i)) {
                return false;
            }
            else if (i>=4 && Arrays.binarySearch(LETRAS, matr_i)<0) {
                return false;
            }
        }
        return true;
    }

    public static boolean comprobaPrezo(int prezo) {
        if (10000<=prezo && prezo<=100000) {
            return true;
        }
        return false;
    }

    public static boolean comprobaModelo(String modelo) {
        if (modelo.startsWith("Tesla") || modelo.startsWith("Toyota")) {
            return true;
        }
        return false;
    }

    public String describeCoche() {
        return "Coche [matricula = " + matricula + ", prezo = " + prezo + ", modelo = " + modelo + "]";
    }

    
    
}
package ej3;

public class CocheException extends Exception {

    public CocheException(String error) {
        super("Error al crear el coche. " + error);
    }
    
}
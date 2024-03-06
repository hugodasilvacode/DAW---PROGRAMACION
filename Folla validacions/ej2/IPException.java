package ej2;

public class IPException extends Exception {

    public IPException(String error) {
        super("Formato de IP invalido. " + error);
    }
    
}
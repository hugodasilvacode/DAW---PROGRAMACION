public class OrdenadorException extends Exception{

    public OrdenadorException(String numeroDeSerie, String mensaxe) {
        super(numeroDeSerie +": "+ mensaxe);
    }
}
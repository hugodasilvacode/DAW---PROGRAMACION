public class AppNumeroDouble {
    
    public static void main(String[] args) {
        
        NumeroDouble num1 = new NumeroDouble();
        NumeroDouble num2 = new NumeroDouble(2.3);
        NumeroDouble num3 = new NumeroDouble();
        NumeroDouble num4 = new NumeroDouble(3.4);

        System.out.println(num1.getValor());
        System.out.println(num2.getValor());
        System.out.println(num3.getValor());
        System.out.println(num4.getValor());
    }
}

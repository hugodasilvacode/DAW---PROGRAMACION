
public class AppStringBuilder1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bo dia paseante");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        int tresmil = 3000;
        sb.delete(7, sb.length());
        System.out.println(sb);
        sb.append("aos "+tresmil+" paseantes");
        System.out.println(sb);

        sb.append(" da zona vella");
        System.out.println(sb);

        String cadea = sb.substring(sb.length()-10, sb.length());
        System.out.println(cadea);
    }   
}
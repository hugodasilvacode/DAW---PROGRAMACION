/*
Crea unha lista de tipo String, e engade 4 elementos String: 
“Roma”, “París”, “Estocolmo”, “Viena”. 
Convirte a lista nun array e mostra os elementos cun for.
*/

import java.util.ArrayList;

public class Ej3 {
    public static void main(String[] args) {
        
        ArrayList<String> cidadeList = new ArrayList<String>();

        cidadeList.add("Roma");
        cidadeList.add("Paris");
        cidadeList.add("Estocolmo");
        cidadeList.add("Viena");

        String [] cidadeArray = new String[4];

        cidadeArray = cidadeList.toArray(cidadeArray);
        
        for (String string : cidadeArray) {
            System.out.println(string);
        }
    }
}
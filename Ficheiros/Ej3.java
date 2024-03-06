import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ej3
 */
public class Ej3 {
    public static void main(String[] args) {

        try (Scanner escaner = new Scanner(new File("test.txt"))) {
            while (escaner.hasNext()) {
                System.out.println(escaner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
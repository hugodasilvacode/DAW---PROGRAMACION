import java.util.ArrayList;
import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);

        ArrayList<Cliente> clienteList = new ArrayList<Cliente>();

        while (true) {

            Boolean salir = false;

            System.out.println("a) Introducir un cliente novo");
            System.out.println("b) Mostrar todos os clientes");
            System.out.println("c) Saír");

            System.out.println("Elige ina opcion");
            String opcion = escaner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Nombre: ");
                    String nome = escaner.nextLine();
                    System.out.println("Telefono: ");
                    String tfno = escaner.nextLine();
                    System.out.println("Email: ");
                    String email = escaner.nextLine();

                    Cliente nuevoCliente = new Cliente(nome,tfno,email);
                    clienteList.add(nuevoCliente);

                    break;
                case "b":
                    for (Cliente cliente : clienteList) {
                        System.out.println(cliente.getNome());
                        System.out.println(cliente.getTfno());
                        System.out.println(cliente.getEmail());
                    }
                    break;
                case "c":
                    salir = true;
                    break;
            }

            if (salir) {
                break;
            }
        }
    }
}
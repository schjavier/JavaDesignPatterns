import Proxy.ExecuteProxyExample;
import Visitor.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int option = 0;

        System.out.println("Bienvenido a los patrones de diseño");

        do {
            System.out.println("Seleccione una opcion");
            System.out.println("1 - Ejecutar Patron Proxy");
            System.out.println("2 - Ejecutar Patron Visitor");
            System.out.println("0 - Salir");
            option = Integer.parseInt(teclado.nextLine());

            switch (option) {
                case 1 -> new ExecuteProxyExample();
                case 2 -> new ExecuteVisitorExample();

            }

        } while (option != 0);


    }
}
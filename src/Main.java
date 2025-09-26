import Prototype.ExecutePrototypeExample;
import Proxy.ExecuteProxyExample;
import Visitor.*;
import Decorator.ExecuteDecoratorExample;

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
            System.out.println("3 - Ejecutar Patron Decorator");
            System.out.println("4 - Ejecutar Patron Prototype");
            System.out.println("0 - Salir");
            option = Integer.parseInt(teclado.nextLine());

            switch (option) {
                case 1 -> new ExecuteProxyExample();
                case 2 -> new ExecuteVisitorExample();
                case 3 -> new ExecuteDecoratorExample();
                case 4 -> new ExecutePrototypeExample();
            }

        } while (option != 0);


    }
}
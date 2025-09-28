import FactoryMethod.ExecuteFactoryMethodExample;
import Flyweight.ExecuteFlyweightExample;
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
            System.out.println("5 - Ejecutar Patron Factory Method");
            System.out.println("6 - Ejecutar Patron Flyweight");
            System.out.println("0 - Salir");
            option = Integer.parseInt(teclado.nextLine());

            switch (option) {
                case 1 -> new ExecuteProxyExample();
                case 2 -> new ExecuteVisitorExample();
                case 3 -> new ExecuteDecoratorExample();
                case 4 -> new ExecutePrototypeExample();
                case 5 -> new ExecuteFactoryMethodExample();
                case 6 -> new ExecuteFlyweightExample();
            }

        } while (option != 0);


    }
}
import Examples.Builder.ExecuteBuilderExample;
import Examples.ChainOC.ExecuteChainOfCommand;
import Examples.Example;
import Examples.Mediator.ExecuteMediatorExample;
import Examples.Prototype.ExecutePrototypeExample;
import Examples.Proxy.ExecuteProxyExample;
import Examples.Singleton.ExecuteSingletonExample;
import Examples.Visitor.*;
import Examples.Decorator.ExecuteDecoratorExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        boolean go_on = true;

        ArrayList<Example> examples = new ArrayList<Example>(Arrays.asList(
                new ExecuteDecoratorExample(),
                new ExecutePrototypeExample(),
                new ExecuteProxyExample(),
                new ExecuteVisitorExample(),
                new ExecuteChainOfCommand(),
                new ExecuteBuilderExample(),
                new ExecuteSingletonExample(),
                new ExecuteMediatorExample()
        ));
        System.out.println("Bienvenido a los patrones de diseño");


        do {
            System.out.println("Seleccione una opcion");
            examples.forEach(example -> IO.println(examples.indexOf(example) + "- " + mostrarInicioMensaje() + example.getExampleName()));
            System.out.println("Otro numero - Salir");

            try {
                option = Integer.parseInt(IO.readln());
            } catch (NumberFormatException e) {
                System.out.println("Opción no permitida");
            }

            if((examples.size()-1) >= option && option >= 0)
            {
                Example running = examples.get(option);
                IO.println("Ejecutando " + running.getExampleName());
                running.execute();
            } else {
                go_on = false;
            }


        } while (go_on);


    }


    public static String mostrarInicioMensaje()
    {
        return " Ejecutar Patron ";
    }
}
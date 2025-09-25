package Decorator;

public class ExecuteDecoratorExample {
    public ExecuteDecoratorExample() {
        IO.println("Ejemplo de patrón Decorator");
        IO.println("Sin decorator: " + new PiruloBase().hacerAlgo());
        IO.println("Con decorator: " + new PiruloPlus(new PiruloBase()).hacerAlgo() + "\n");
    }
}

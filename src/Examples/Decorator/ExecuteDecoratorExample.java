package Examples.Decorator;


import Examples.Example;

public class ExecuteDecoratorExample implements Example {
    public void execute() {
        IO.println("Sin decorator: " + new PiruloBase().hacerAlgo());
        IO.println("Con decorator: " + new PiruloPlus(new PiruloBase()).hacerAlgo() + "\n");
    }

    @Override
    public String getExampleName() {
        return "Decorator";
    }
}

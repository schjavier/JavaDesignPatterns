package Decorator;

public class PiruloPlus implements Pirulo {
    public Pirulo pirulo;

    public PiruloPlus(Pirulo pirulo) {
        this.pirulo = pirulo;
    }

    public String hacerAlgo() {
        return pirulo.hacerAlgo() + " más";
    }
}

package FactoryMethod;

public class SangucheVegano extends Sanguche {
    public SangucheVegano(TipoSanguche tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Soy de tomate y lechuga y soy " + tipo;
    }
}

package FactoryMethod;

public class SangucheRegular extends Sanguche{
    public SangucheRegular(TipoSanguche tipo) {
        super(tipo);
    }

    @Override
    public String toString() {
        return "Soy de jamón y queso y soy " + tipo;
    }
}

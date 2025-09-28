package FactoryMethod;

public abstract class Sanguche {
    TipoSanguche tipo;

    public Sanguche(TipoSanguche tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Soy un sanguche " + tipo;
    }
}

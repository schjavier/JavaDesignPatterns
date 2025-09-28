package FactoryMethod;

public enum TipoSanguche {
    DOBLE("doble"),
    TRIPLE("triple");

    private final String capas;

    TipoSanguche(String capas) {
        this.capas = capas;
    }

    @Override
    public String toString() {
        return this.capas;
    }
}

package Flyweight;

public enum TipoArbol {
    PLATANO("plátano"),
    GINGKO("gingko"),
    ARCE_ROJO("arce rojo");

    private final String tipo;

    @Override
    public String toString() {
        return tipo;
    }

    TipoArbol(String tipo) {
        this.tipo = tipo;
    }
}

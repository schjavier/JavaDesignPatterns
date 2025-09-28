package Flyweight;

public class Arbol implements DataArbol {
    // Datos intrínsecos
    private final TipoArbol tipoArbol;
    private final Color colorHojas;

    public Arbol(TipoArbol tipoArbol, Color colorHojas) {
        this.tipoArbol = tipoArbol;
        this.colorHojas = colorHojas;
    }

    @Override
    public void obtenerInfo(int altura, char orientacion) {
        IO.println("Creando árbol de tipo " + tipoArbol +
                ", con hojas " + colorHojas +
                ", altura de " + altura +
                " metros y orientación: " + orientacion);
    }
}

package Flyweight;

public enum Color {
    ROJO("rojas"),
    VERDE("verdes"),
    AMARILLO("amarillas");

    private final String color;

    @Override
    public String toString() {
        return color;
    }

    Color(String color) {
        this.color = color;
    }
}

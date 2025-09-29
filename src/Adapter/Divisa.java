package Adapter;

public enum Divisa {
    USD("dólares"),
    EUR("euros");

    private final String nombre;

    Divisa(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

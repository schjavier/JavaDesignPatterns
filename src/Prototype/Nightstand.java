package Prototype;

public class Nightstand extends Table<Nightstand> {
    public Nightstand(int height, int width, String color) {
        super(height, width, color);
    }

    public Nightstand(Table sourceObj) {
        super(sourceObj);
    }

    public Nightstand() {
    }
}
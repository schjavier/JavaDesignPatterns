package Prototype;

public class CoffeeTable extends Table<CoffeeTable> {
    public CoffeeTable(int height, int width, String color) {
        super(height, width, color);
    }

    public CoffeeTable(Table sourceObj) {
        super(sourceObj);
    }

    public CoffeeTable() {
    }
}

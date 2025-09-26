package Examples.Prototype;

public class DiningTable extends Table<DiningTable> {
    public DiningTable(int height, int width, String color) {
        super(height, width, color);
    }

    public DiningTable(Table sourceObj) {
        super(sourceObj);
    }

    public DiningTable() {
    }
}
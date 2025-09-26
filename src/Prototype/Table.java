package Prototype;

public abstract class Table<T extends Table<T>> extends Prototype<T> {
    public int height;
    public int width;
    public String color;

    public Table(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Table(Table sourceObj) {
        this.height = sourceObj.height;
        this.width = sourceObj.width;
        this.color = sourceObj.color;
    };
    public Table() {};

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}

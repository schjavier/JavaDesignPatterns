package Examples.Prototype;

public abstract class Prototype<T> implements Cloneable {
    public T copy() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning not supported", e);
        }
    }
}

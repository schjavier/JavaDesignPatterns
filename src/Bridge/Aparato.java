package Bridge;

public interface Aparato {
    boolean estaEncendido();
    void encender();
    void apagar();
    int getVolumen();
    void setVolumen(int nivel);
    void mostrarEstado();
}

package Bridge;

public class Televisor implements Aparato {
    public boolean encendido = false;
    public int volumen = 10;

    @Override
    public boolean estaEncendido() {
        return encendido;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int nivel) {
        if (nivel > 100) {
            this.volumen = 100;
        } else if (nivel < 0) {
            this.volumen = 0;
        } else {
            this.volumen = nivel;
        }
    }

    @Override
    public void mostrarEstado() {
        IO.println("TELEVISOR: \nEncendido: " + encendido + "\nVolumen: " + volumen + "\n");
    }
}

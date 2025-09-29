package Bridge;

public class RemotoAvanzado extends RemotoSimple {
    public RemotoAvanzado(Aparato aparato) {
        super(aparato);
    }

    public void silenciar() {
        IO.println("Shhh");
        aparato.setVolumen(0);
    }

    public void joder() {
        IO.println("Poniendo el volumen AL MANGO");
        aparato.setVolumen(100);
    }
}

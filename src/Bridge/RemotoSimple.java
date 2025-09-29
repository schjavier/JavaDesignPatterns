package Bridge;

public class RemotoSimple implements Remoto {
    protected final Aparato aparato;

    public RemotoSimple(Aparato aparato) {
        this.aparato = aparato;
    }

    @Override
    public void encender() {
        if (aparato.estaEncendido()) {
            IO.println("Ya está encendido!");
        } else {
            IO.println("Encendiendo remotamente...");
            aparato.encender();
        }
    }

    @Override
    public void apagar() {
        if (!aparato.estaEncendido()) {
            IO.println("Ya está apagado!");
        } else {
            IO.println("Apagando remotamente...");
            aparato.apagar();
        }
    }

    @Override
    public void subirVolumen() {
        int volumen = aparato.getVolumen();
        if (volumen >= 100) IO.println("Volumen máximo alcanzado!");
        if (volumen <= 100) aparato.setVolumen(volumen + 5);
    }

    @Override
    public void bajarVolumen() {
        int volumen = aparato.getVolumen();
        if (volumen <= 0) IO.println("Volumen mínimo alcanzado");
        if (volumen <= 100) aparato.setVolumen(volumen - 5);
    }
}

package Bridge;

public class ExecuteBridgeExample {
    public ExecuteBridgeExample() {
        Televisor televisor = new Televisor();
        Radio radio = new Radio();

        probarControl(televisor);
        probarControl(radio);
    }

    public void probarControl(Aparato aparato) {
        RemotoSimple remoto = new RemotoSimple(aparato);
        RemotoAvanzado remotoA = new RemotoAvanzado(aparato);

        IO.println("Remoto simple:\n");

        aparato.mostrarEstado();

        remoto.encender();
        remoto.subirVolumen();

        aparato.mostrarEstado();

        IO.println("Remoto avanzado:\n");

        remotoA.silenciar();
        aparato.mostrarEstado();

        remotoA.joder();
        aparato.mostrarEstado();

        remotoA.apagar();
        aparato.mostrarEstado();

    }
}

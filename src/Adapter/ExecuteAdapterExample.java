package Adapter;

public class ExecuteAdapterExample {
    PasarelaPago pasarela1 = new PasarelaPago();
    PasarelaPagoAlternativa pasarela2 = new PasarelaPagoAlternativa();
    AdapterPPAlt adaptador = new AdapterPPAlt(pasarela2);

    Pago pago = new Pago(180.5F,"1ABC");

    public ExecuteAdapterExample() {
        IO.println("Pasarela original:\n");
        pasarela1.autorizarPago(pago);
        pasarela1.confirmarPago(pago);
        pasarela1.cancelarPago(pago);
        IO.println("\nPasarela alternativa:\n");
        pasarela2.iniciarTransaccion(250,Divisa.EUR);
        pasarela2.finalizarTransaccion("QAD203");
        pasarela2.revertirTransaccion("QAD203");
        IO.println("\nAdaptador entre original y alternativa:\n");
        adaptador.autorizarPago(pago);
        adaptador.confirmarPago(pago);
        adaptador.cancelarPago(pago);
        IO.println("\n");
    }
}

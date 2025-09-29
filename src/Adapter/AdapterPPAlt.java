package Adapter;

public class AdapterPPAlt {
    private final PasarelaPagoAlternativa pasarelaAlternativa;

    public AdapterPPAlt(PasarelaPagoAlternativa pasarelaAlternativa) {
        this.pasarelaAlternativa = pasarelaAlternativa;
    }

    public void autorizarPago(Pago pago) {
        this.pasarelaAlternativa.iniciarTransaccion((float) pago.monto,Divisa.USD);
    }

    public void confirmarPago(Pago pago) {
        this.pasarelaAlternativa.finalizarTransaccion(pago.idTransaccion);
    }

    public void cancelarPago(Pago pago) {
        this.pasarelaAlternativa.revertirTransaccion(pago.idTransaccion);
    }
}

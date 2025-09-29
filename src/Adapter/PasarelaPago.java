package Adapter;

public class PasarelaPago {
    public void autorizarPago(Pago pago) {
        IO.println("Se autorizó un pago por: $" + pago.monto);
    }

    public void confirmarPago(Pago pago) {
        IO.println("Se confirmó el pago nro: " + pago.idTransaccion);
    }

    public void cancelarPago(Pago pago) {
        IO.println("Se canceló el pago nro: " + pago.idTransaccion);
    }
}

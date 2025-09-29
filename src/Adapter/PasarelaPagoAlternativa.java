package Adapter;

public class PasarelaPagoAlternativa {
    public void iniciarTransaccion(float cantidad, Divisa divisa) {
        IO.println("Se inició una transacción por: " + cantidad + " " + divisa);
    }

    public void finalizarTransaccion(String codigo) {
        IO.println("La transacción nro. " + codigo + " ha sido finalizada.");
    }

    public void revertirTransaccion(String codigo) {
        IO.println("La transacción nro. " + codigo + " ha sido revertida.");
    }
}

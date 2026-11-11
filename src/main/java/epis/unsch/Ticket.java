package epis.unsch;

public class Ticket implements Comprobante {
    private String cliente;

    public Ticket(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getTipo() {
        return "TICKET";
    }

    @Override
    public String generarDetalle(double monto) {
        return String.format("--- TICKET DE VENTA ---\nCliente: %s\nMonto Total: S/ %.2f\nEstado: Emitido", cliente, monto);
    }
}
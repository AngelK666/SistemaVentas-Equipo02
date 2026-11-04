package epis.unsch;

public class Boleta implements Comprobante {
    private String dniCliente;

    public Boleta(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    @Override
    public String getTipo() {
        return "BOLETA DE VENTA";
    }

    @Override
    public String generarDetalle(double monto) {
        return "Boleta emitida a DNI: " + dniCliente + " | Total: S/. " + monto;
    }
}
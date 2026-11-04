package epis.unsch;

public class Factura implements Comprobante {
    private String rucCliente;

    public Factura(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    @Override
    public String getTipo() {
        return "FACTURA ELECTRÓNICA";
    }

    @Override
    public String generarDetalle(double monto) {
        double igv = monto * 0.18;
        return "Factura emitida a RUC: " + rucCliente + " | Subtotal: S/. " + (monto - igv) + " | IGV (18%): S/. " + igv + " | Total: S/. " + monto;
    }
}
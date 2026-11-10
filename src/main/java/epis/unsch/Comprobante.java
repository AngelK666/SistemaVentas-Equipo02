package epis.unsch;

public interface Comprobante {
    String getTipo();
    String generarDetalle(double monto);

 }
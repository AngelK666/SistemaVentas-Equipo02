package epis.unsch;

public interface IPasarelaPago {

    // El método que TODAS las pasarelas deberán implementar obligatoriamente
    void procesarPago(double monto, String nombreCliente);

}